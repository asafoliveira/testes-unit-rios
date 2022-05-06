package rpg_game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BotaPrataTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste BotaPrata=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando BotaPrata==========\n");
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
	public void testContrutorBotaPrata() {
		System.out.println("testContrutorBotaPrata");
		
		BotaPrata botaPrata = new BotaPrata();
		
		assertEquals(2, botaPrata.getForca());
		
		assertEquals(1, botaPrata.getAgilidade());
		
		assertEquals(1, botaPrata.getInteligencia());
		
		assertEquals("Bota prata", botaPrata.getNomeBota());
		
	}

}
