//Gkavardina Aggeliki: 4042
//Antwniou Dimitra Despoina: 4026
//Kokkali Iwanna: 4268



package test;

import server.DatasetManagerFactory;
import server.IDatasetManager;
import server.DatasetManager;
import server.OriginalDataset;
import server.Dataset;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DatasetRegistrationTest {
	
	@Test
	public void testRegisterDataset(){
		DatasetManagerFactory dM = new DatasetManagerFactory();
		IDatasetManager dataMan = dM.create("str");
		dataMan.registerDataset("NBA", "C:\\Users\\stell\\Desktop\\2018-19_CSV-Viewer-ClientOnly\\Resources\\NBA_team_stats.csv");
		ArrayList<Dataset> arrayD = ((DatasetManager)dataMan).getDatasets();
		assertEquals(arrayD.get(0).getHeader()[0], "SeasonEnd");
		assertEquals(arrayD.get(0).getHeader()[1], "Team");
		assertEquals(arrayD.get(0).getHeader()[2], "Playoffs");
		assertEquals(arrayD.get(0).getHeader()[3], "W");
		assertEquals(arrayD.get(0).getHeader()[4], "PTS");
		assertEquals(arrayD.get(0).getHeader()[5], "oppPTS");
		assertEquals(arrayD.get(0).getHeader()[6], "FG");
		assertEquals(arrayD.get(0).getHeader()[7], "FGA");
		assertEquals(arrayD.get(0).getHeader()[8], "2P");
		assertEquals(arrayD.get(0).getHeader()[9], "2PA");
		assertEquals(arrayD.get(0).getHeader()[10], "3P");
		assertEquals(arrayD.get(0).getHeader()[11], "3PA");
		assertEquals(arrayD.get(0).getHeader()[12], "FT");
		assertEquals(arrayD.get(0).getHeader()[13], "FTA");
		assertEquals(arrayD.get(0).getHeader()[14], "ORB");
		assertEquals(arrayD.get(0).getHeader()[15], "DRB");
		assertEquals(arrayD.get(0).getHeader()[16], "AST");
		assertEquals(arrayD.get(0).getHeader()[17], "STL");
		assertEquals(arrayD.get(0).getHeader()[18], "BLK");
		assertEquals(arrayD.get(0).getHeader()[19], "TOV");
	
		assertEquals(arrayD.get(0).getData().get(0)[0], "1980");
		assertEquals(arrayD.get(0).getData().get(0)[1], "Atlanta Hawks");
		assertEquals(arrayD.get(0).getData().get(0)[2], "1");
		assertEquals(arrayD.get(0).getData().get(0)[3], "50");
		assertEquals(arrayD.get(0).getData().get(0)[4], "8573");
		assertEquals(arrayD.get(0).getData().get(0)[5], "8334");
		assertEquals(arrayD.get(0).getData().get(0)[6], "3261");
		assertEquals(arrayD.get(0).getData().get(0)[7], "7027");
		assertEquals(arrayD.get(0).getData().get(0)[8], "3248");
		assertEquals(arrayD.get(0).getData().get(0)[9], "6952");
		assertEquals(arrayD.get(0).getData().get(0)[10], "13");
		assertEquals(arrayD.get(0).getData().get(0)[11], "75");
		assertEquals(arrayD.get(0).getData().get(0)[12], "2038");
		assertEquals(arrayD.get(0).getData().get(0)[13], "2645");
		assertEquals(arrayD.get(0).getData().get(0)[14], "1369");
		assertEquals(arrayD.get(0).getData().get(0)[15], "2406");
		assertEquals(arrayD.get(0).getData().get(0)[16], "1913");
		assertEquals(arrayD.get(0).getData().get(0)[17], "782");
		assertEquals(arrayD.get(0).getData().get(0)[18], "539");
		assertEquals(arrayD.get(0).getData().get(0)[19], "1495");
	}
}
