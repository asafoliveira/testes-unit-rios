package rpg_game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BotaBronzeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste BotaBronze=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando BotaBronze==========\n");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando teste");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando teste");
	}

	@Test
	public void testContrutorBotaBronze() {
		System.out.println("testContrutorBotaBronze");
		BotaBronze botaBronze = new BotaBronze();
		
		assertEquals("Bota bronze", botaBronze.getNomeBota());
		
		assertEquals(1, botaBronze.getForca());
	}

}
