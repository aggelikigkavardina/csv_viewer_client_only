//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import server.DatasetManagerFactory;
import server.IDatasetManager;

class DatasetRetrieveTest {

	@Test
	public void testRetrieveDataset(){
		DatasetManagerFactory dM = new DatasetManagerFactory();
		IDatasetManager dataMan = dM.create("str");
		dataMan.registerDataset("NBA", "C:\\Users\\stell\\Desktop\\2018-19_CSV-Viewer-ClientOnly\\Resources\\NBA_team_stats.csv");
		
		String[] headers;
		ArrayList<String[]> arrayA = new ArrayList<String[]>();
		headers = dataMan.retrieveDataset("NBA", arrayA);
		
		assertEquals(headers[0], "SeasonEnd");
		assertEquals(headers[1], "Team");
		assertEquals(headers[2], "Playoffs");
		assertEquals(headers[3], "W");
		assertEquals(headers[4], "PTS");
		assertEquals(headers[5], "oppPTS");
		assertEquals(headers[6], "FG");
		assertEquals(headers[7], "FGA");
		assertEquals(headers[8], "2P");
		assertEquals(headers[9], "2PA");
		assertEquals(headers[10], "3P");
		assertEquals(headers[11], "3PA");
		assertEquals(headers[12], "FT");
		assertEquals(headers[13], "FTA");
		assertEquals(headers[14], "ORB");
		assertEquals(headers[15], "DRB");
		assertEquals(headers[16], "AST");
		assertEquals(headers[17], "STL");
		assertEquals(headers[18], "BLK");
		assertEquals(headers[19], "TOV");
	
		assertEquals(arrayA.get(0)[0], "1980");
		assertEquals(arrayA.get(0)[1], "Atlanta Hawks");
		assertEquals(arrayA.get(0)[2], "1");
		assertEquals(arrayA.get(0)[3], "50");
		assertEquals(arrayA.get(0)[4], "8573");
		assertEquals(arrayA.get(0)[5], "8334");
		assertEquals(arrayA.get(0)[6], "3261");
		assertEquals(arrayA.get(0)[7], "7027");
		assertEquals(arrayA.get(0)[8], "3248");
		assertEquals(arrayA.get(0)[9], "6952");
		assertEquals(arrayA.get(0)[10], "13");
		assertEquals(arrayA.get(0)[11], "75");
		assertEquals(arrayA.get(0)[12], "2038");
		assertEquals(arrayA.get(0)[13], "2645");
		assertEquals(arrayA.get(0)[14], "1369");
		assertEquals(arrayA.get(0)[15], "2406");
		assertEquals(arrayA.get(0)[16], "1913");
		assertEquals(arrayA.get(0)[17], "782");
		assertEquals(arrayA.get(0)[18], "539");
		assertEquals(arrayA.get(0)[19], "1495");
	}
}
