//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package server;

import java.util.ArrayList;

public class ProducedDataset extends Dataset{
	
	private String fromOriginal;
	private String filterColumnName;
	private String filterValue;
	
	public ProducedDataset(String fromOriginal, String filterColumnName, String filterValue, String name, String[] header, ArrayList<String[]> data){
		super(name, header, data);
		this.fromOriginal = fromOriginal;
		this.filterColumnName = filterColumnName;
		this.filterValue = filterValue;		
	}
	
	public void showHistory(){
		System.out.println("History# This dataset produced from DATASET: " + fromOriginal + " with \'" + filterColumnName + " = " + filterValue + "\'");
	}

}
