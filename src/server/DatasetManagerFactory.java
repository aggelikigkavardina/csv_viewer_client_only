//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package server;

import java.util.ArrayList;

public class DatasetManagerFactory {

	public DatasetManagerFactory() {
		;
	}

	/*
	 * TODO FIX THIS!!! Cannot return null!
	 */
	public IDatasetManager create(String className) { 
		return new DatasetManager();
	}
	
	public static Dataset createOriginalDataset(String fromFile, String name, String[] header, ArrayList<String[]> data){
		return new OriginalDataset(fromFile, name, header, data);
	}	
	
	public static Dataset createProducedDataset(String fromOriginal, String filterColumnName, String filterValue, String name, String[] header, ArrayList<String[]> data){
		return new ProducedDataset(fromOriginal, filterColumnName, filterValue, name, header, data);
	}
}
