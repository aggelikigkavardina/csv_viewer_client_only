//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package server;

import java.util.ArrayList;

public abstract class Dataset {
	
	private String name;
	private String[] header;
	private ArrayList<String[]> data;
	
	public Dataset(String name, String[] header, ArrayList<String[]> data){
		
		this.name = name;
		this.header = header;
		this.data = data;		
	}
	
	public String getName(){
		return name;
	}
	public String[] getHeader(){
		return header;
	}
	public ArrayList<String[]> getData(){
		return data;
	}
	
	public abstract void showHistory(); 
}
