//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package server;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DatasetManager implements IDatasetManager{
	
	private ArrayList<Dataset> datasets;
	
	public DatasetManager(){
		datasets = new ArrayList<Dataset>();
	}
	
	public int registerDataset(String datasetName, String canonicalPath){
		if(datasetName == null){
			return -1;
		}	
		
		if(checkName(datasetName)){
			return -10;
		}
		
		Scanner inputReader = null;
		try{	
			inputReader = new Scanner(new FileInputStream(canonicalPath));
		}
		catch(FileNotFoundException e){
			System.out.println("File " + datasetName + "was not found");
			System.out.println("or could not be opened.");
			System.exit(0);
		}
		
		String firstLine = inputReader.nextLine();
		String[] headers = firstLine.split(",");
		
		String line;
		String[] dataOfLine;
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		while(inputReader.hasNext()){
			line = inputReader.nextLine();
			dataOfLine = line.split(",");
			data.add(dataOfLine);
		}		
		
		datasets.add(DatasetManagerFactory.createOriginalDataset(canonicalPath, datasetName, headers, data));
		return 0;	
	}
	
	private boolean checkName(String datasetName){
		for(int i=0; i< datasets.size(); i++){
			if(datasetName.equals(datasets.get(i).getName())){
				return true;
			}
		}
		return false;
	}
	
	public String[] retrieveDataset(String datasetName, ArrayList<String[]> data){
		for(int i=0; i<datasets.size(); i++){
			if(datasetName.equals(datasets.get(i).getName())){
				for(int j=0; j<datasets.get(i).getData().size(); j++){
					data.add(datasets.get(i).getData().get(j));
				}
				String[] arrayHeaders = new String[datasets.get(i).getHeader().length];
				for(int j=0; j<arrayHeaders.length; j++){
					arrayHeaders[j] = datasets.get(i).getHeader()[j];
				}		
				return arrayHeaders;
			}
		}
		System.out.println("Dataset not exists");
		return null;
	}
	
	public int filterDataset(String originalDatasetName,String newDatasetName, String filterColumnName, String filterValue){
		ArrayList<String[]> arrayFilter = new ArrayList<String[]>();
		
		for(int i=0; i<datasets.size(); i++){
			if(originalDatasetName.equals(datasets.get(i).getName())){
				for(int j=0; j<datasets.get(i).getHeader().length; j++){
					if(datasets.get(i).getHeader()[j].equals(filterColumnName)){
						for(int k=0; k<datasets.get(i).getData().size(); k++){
							if(datasets.get(i).getData().get(k)[j].equals(filterValue)){
								arrayFilter.add(datasets.get(i).getData().get(k));
							}
						}
						
						datasets.add(DatasetManagerFactory.createProducedDataset(originalDatasetName, filterColumnName, filterValue, newDatasetName, datasets.get(i).getHeader(), arrayFilter));
						
						return 0;
					}
				}				
			}
		}
		return -1;
	}
	
	public ArrayList<String[]> getDatasetProjection(String datasetName, ArrayList<String> attributeNames){
		ArrayList<String[]> arrayProj = new ArrayList<String[]>();
		
		int[] attributePosition = {-1,-1};
		String[] line;
		
		for(int i=0; i<datasets.size(); i++){
			if(datasetName.equals(datasets.get(i).getName())){
				for(int j=0; j<datasets.get(i).getHeader().length; j++){
					if(datasets.get(i).getHeader()[j].equals(attributeNames.get(0))){
						attributePosition[0] = j;
					}
					if(datasets.get(i).getHeader()[j].equals(attributeNames.get(1))){
						attributePosition[1] = j;
					}	
				}
				if(attributePosition[0] < 0 && attributePosition[1] < 0){
					return null;
				}
				for(int j=0; j<datasets.get(i).getData().size(); j++){
					line = new String[2];
					line[0] = datasets.get(i).getData().get(j)[attributePosition[0]];
					line[1] = datasets.get(i).getData().get(j)[attributePosition[1]];
					
					arrayProj.add(line);
				}
				return arrayProj;
			}
		}	
		return null;		
	}
	
	public ArrayList<Dataset> getDatasets(){
		return datasets;
	}
}
