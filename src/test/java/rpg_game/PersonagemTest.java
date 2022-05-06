package rpg_game;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonagemTest {
	
	//Instâncias
	Personagem asafQA;
	Bota bota;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("\n=======Teste Personagem=========");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("=========Terminando Personagem==========\n");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Iniciando Teste");
		asafQA = new Personagem();
		bota = new Bota();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminando Teste");
	}

	@Test
	public void testAgilidadeSemBota() {
		System.out.println("testAgilidadeSemBota");
		
		asafQA.setAgilidade(4);
		
		assertEquals(4, asafQA.getAgilidade());
	}
	
	
	@Test
	public void testAgilidadeBotaIgualZero() {
		System.out.println("testAgilidadeBotaIgualZero");
		
		asafQA.setAgilidade(4);
		bota.setAgilidade(0);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(4, asafQA.getAgilidade());
	}
	
	
	@Test
	public void testAgilidadeBotaMaiorQueZero() {
		System.out.println("testAgilidadeBotaMaiorQueZero");
		
		asafQA.setAgilidade(4);
		bota.setAgilidade(2);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(6, asafQA.getAgilidade());
	}
	
	@Test
	public void testForcaSemBota() {
		System.out.println("testForcaSemBota");
		
		asafQA.setForca(5);
		
		assertEquals(5, asafQA.getForca());//Espera-se 5
	}
	
	@Test
	public void testForcaBotaIgualZero() {
		System.out.println("testForcaBotaIgualZero");
		
		asafQA.setForca(5);
		
		bota.setForca(0);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(5, asafQA.getForca());
	}
	
	
	@Test
	public void testForcaBotaMaiorQueZero() {
		System.out.println("testForcaBotaMaiorQueZero");
		
		asafQA.setForca(5);
		
		bota.setForca(3);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(8, asafQA.getForca());
	}
	
	@Test
	public void testInteligenciaSemBota() {
		System.out.println("testInteligenciaSemBota");
		
		Personagem asafQA = new Personagem();
		asafQA.setInteligencia(2);
		
		assertEquals(2, asafQA.getInteligencia());
	}
	
	
	
	@Test
	public void testInteligenciaBotaIgualZero() {
		System.out.println("testInteligenciaBotaIgualZero");
		
		Personagem asafQA = new Personagem();
		asafQA.setInteligencia(3);
		
		Bota bota = new Bota();
		bota.setInteligencia(0);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(3, asafQA.getInteligencia());//Espera-se 3, ou seja, somente a inteligência do personagem
	}
	
	
	@Test
	public void testInteligenciaBotaMaiorQueZero() {
		System.out.println("testInteligenciaBotaMaiorQueZero");
		
		Personagem asafQA = new Personagem();
		asafQA.setInteligencia(4);
		
		Bota bota = new Bota();
		bota.setInteligencia(2);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(6, asafQA.getInteligencia());//Espera-se 6, ou seja, a soma da agilidade o personagem mais da bota
	}
	
	@Test
	public void testHpSemBota() {
		System.out.println("testHpSemBota");
		Personagem asafQA = new Personagem();
		asafQA.setForca(50);
		
		assertEquals(5000, asafQA.getHp());//Espera-se 5000, ou seja, a força do personagem * 100
	}
	
	
	
	@Test
	public void testHpBota() {
		System.out.println("testHpBota");
		
		Personagem asafQA = new Personagem();
		asafQA.setForca(50);
		
		Bota bota = new Bota();
		bota.setForca(40);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(9000, asafQA.getHp());//Espera-se 9000, ou seja, a soma das forças do personagem e bota multiplicado por 100
	}
	
	@Test
	public void testManaSemBota() {
		System.out.println("testManaSemBota");
		
		Personagem asafQA = new Personagem();
		asafQA.setInteligencia(2);
		
		assertEquals(200, asafQA.getMana());//Espera-se 200, ou seja, a inteligência do personagem * 100
	}
	
	
	
	@Test
	public void testManaBota() {
		System.out.println("testManaBota");
		
		asafQA.setInteligencia(20);
		
		Bota bota = new Bota();
		bota.setInteligencia(10);
		
		asafQA.EquiparBota(bota);
		
		assertEquals(3000, asafQA.getMana());//Espera-se 3000, ou seja, a soma das inteligências do personagem e bota multiplicado por 100
	}
	
	@Test
	public void testExibirDadosInicialdoJogador() {
		System.out.println("testExibirDadosInicialdoJogador");
		
		asafQA.setForca(10);
		asafQA.setInteligencia(20);
		asafQA.setAgilidade(10);
		
		
		asafQA.exibirDadosInicialJogador();//Método getHp será chamado o que por sua vez chamará o método setHP (forca * 100) e o mesmo com método getMana
		
	}
	
	@Test
	public void testExibirNovosDadosdoJogador() {
		System.out.println("testExibirNovosDadosdoJogador");
		
		asafQA.setForca(10);
		asafQA.setInteligencia(20);
		asafQA.setAgilidade(10);
		
		asafQA.exibirDadosInicialJogador();
		
		
		asafQA.setForca(12);
		
		asafQA.setInteligencia(15);
		asafQA.setAgilidade(14);
		
		asafQA.exibirNovosDadosJogador();
		
	}
}
