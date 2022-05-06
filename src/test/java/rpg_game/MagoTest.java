package rpg_game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MagoTest {
	
	Mago mago;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste Mago=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando Mago==========\n");
	}


	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando Teste");
		mago = new Mago();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando Teste");
	}

	@Test
	public void testConstrutorMago() {
		System.out.println("testConstrutorMago");
		assertEquals(2, mago.getForca());
		assertEquals(5, mago.getAgilidade());
		assertEquals(10, mago.getInteligencia());
	}
	
	@Test
	public void testLvlUpMago() {
		System.out.println("testLvlUpMago");
		
		//Setup
		mago.lvlUp();
		
		//Testes
		assertEquals(2, mago.getLevel());//Espera level de valor 2
		assertEquals(3, mago.getForca());//Espera força de valor 3
		assertEquals(6, mago.getAgilidade());//Espera agilidade de valor 6
		assertEquals(13, mago.getInteligencia());//Espera inteligência de valor 13
	}

}
