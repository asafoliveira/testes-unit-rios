package rpg_game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GuerreiroTest {
	
	Guerreiro guerreiro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste Guerreiro=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando Guerreiro==========\n");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Inciando Teste");
		guerreiro = new Guerreiro();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando Teste");
	}

	@Test
	public void testConstrutorGuerreiro() {
		System.out.println("testConstrutorGuerreiro");
		
		assertEquals(10, guerreiro.getForca());
		assertEquals(5, guerreiro.getAgilidade());
		assertEquals(2, guerreiro.getInteligencia());
	}
	
	@Test
	public void testLvlUpGuerreiro() {
		System.out.println("testLvlUpGuerreiro");
		//Setup
		guerreiro.lvlUp();
		
		//Teste propriamente dito
		assertEquals(2, guerreiro.getLevel());
		assertEquals(13, guerreiro.getForca());
		assertEquals(6, guerreiro.getAgilidade());
		assertEquals(3, guerreiro.getInteligencia());
	}

}
