package rpg_game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BotaTest {
	
	Bota bota;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste Bota=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando Bota==========\n");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando Teste");
		bota = new Bota();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finalizando Teste");
	}

	@Test
	public void testSetGetForca() {
		System.out.println("testSetGetForca");
		
		bota.setForca(10);
		
		assertEquals(10, bota.getForca());
	}
	
	@Test
	public void testSetGetAgilidade() {
		System.out.println("testSetGetAgilidade");
		
		bota.setAgilidade(4);
		
		assertEquals(4, bota.getAgilidade());
	}
	
	@Test
	public void testSetGetInteligencia() {
		System.out.println("testSetGetInteligencia");
		
		bota.setInteligencia(2);
		
		assertEquals(2, bota.getInteligencia());
	}
	
	@Test
	public void testSetGetNomeDaBota() {
		System.out.println("testSetGetNomeDaBota");
		
		bota.setNomeBota("Bota QA Asaf");
		
		assertEquals("Bota QA Asaf", bota.getNomeBota());
	}
	
	
}
