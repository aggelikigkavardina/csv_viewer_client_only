//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package server;

import java.util.ArrayList;

public class OriginalDataset extends Dataset{

	private String fromFile;
	
	public OriginalDataset(String fromFile, String name, String[] header, ArrayList<String[]> data){
		super(name, header, data);
		this.fromFile = fromFile;
	}
	
	public void showHistory(){
		System.out.println("History# This dataset produced from FILE: " + fromFile);
	}
}
