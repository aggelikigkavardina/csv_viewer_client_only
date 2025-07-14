//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import server.Dataset;
import server.DatasetManager;
import server.DatasetManagerFactory;
import server.IDatasetManager;

class FilteredDatasetTest {

	@Test
	public void testFilteredDataset(){
		DatasetManagerFactory dM = new DatasetManagerFactory();
		IDatasetManager dataMan = dM.create("str");
		dataMan.registerDataset("NBA", "C:\\Users\\stell\\Desktop\\2018-19_CSV-Viewer-ClientOnly\\Resources\\NBA_team_stats.csv");
		ArrayList<Dataset> arrayD = ((DatasetManager)dataMan).getDatasets();
		
		dataMan.filterDataset("NBA", "Celtics", "Team", "Boston Celtics");
		
		String[] headers;
		ArrayList<String[]> arrayA = new ArrayList<String[]>();
		headers = dataMan.retrieveDataset("Celtics", arrayA);
		
		for(int i=1; i<arrayA.size(); i++) {
			assertEquals(arrayA.get(i)[1], "Boston Celtics");
		}
	}

}