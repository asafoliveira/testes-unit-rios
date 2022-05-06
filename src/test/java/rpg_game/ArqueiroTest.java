package rpg_game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArqueiroTest {
	
	Arqueiro arqueiro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste Arqueiro=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando Arqueiro==========\n");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando teste");
		
		arqueiro = new Arqueiro();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando teste");
	}

	@Test
	public void testConstrutorArqueiro() {
		System.out.println("testConstrutorArqueiro");
		assertEquals(5, arqueiro.getForca());
		assertEquals(10, arqueiro.getAgilidade());
		assertEquals(2, arqueiro.getInteligencia());
	}
	
	@Test
	public void testLvlUpArqueiro() {
		System.out.println("testLvlUpArqueiro");
		
		//Ação
		arqueiro.lvlUp();
		
		//Teste 
		assertEquals(2, arqueiro.getLevel());//Espera level de valor 2
		assertEquals(6, arqueiro.getForca());//Espera força de valor 6
		assertEquals(13, arqueiro.getAgilidade());//Espera agilidade de valor 13
		assertEquals(3, arqueiro.getInteligencia());//Espera inteligência de valor 3
	}

}
