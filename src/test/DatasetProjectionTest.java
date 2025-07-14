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

class DatasetProjectionTest {

	@Test
	public void testProjectionDataset(){
		DatasetManagerFactory dM = new DatasetManagerFactory();
		IDatasetManager dataMan = dM.create("str");
		dataMan.registerDataset("NBA", "C:\\Users\\aggeliki\\Desktop\\2018-19_CSV-Viewer-ClientOnly\\Resources\\NBA_team_stats.csv");
		
		ArrayList<String> attributes = new ArrayList<String>();
		attributes.add("Team");
		attributes.add("W");
		
		ArrayList<String[]> arrayResult = dataMan.getDatasetProjection("NBA", attributes);
		
		assertEquals(arrayResult.get(0).length, 2);
		
		assertEquals(arrayResult.get(0)[0], "Atlanta Hawks");
		assertEquals(arrayResult.get(0)[1], "50");
		
		assertEquals(arrayResult.get(1)[0], "Boston Celtics");
		assertEquals(arrayResult.get(1)[1], "61");
		
		assertEquals(arrayResult.get(2)[0], "Chicago Bulls");
		assertEquals(arrayResult.get(2)[1], "30");
	}
}
