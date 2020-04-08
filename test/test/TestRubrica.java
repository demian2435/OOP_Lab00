package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import rubricaTelefonica.Rubrica;

public class TestRubrica {

	private Rubrica rubrica;
	
	@Before
	public void setUp() {
		// FASE 1 SETUP: Crea oggetti dove eseguire le operazioni
		rubrica = new Rubrica("Titolo");
		
		// ATTENZIONE ALLE VARIABILI STATIC 
	}

	@Test
	public void test1() {
		// FASE 2 RISULTATI: Crea dei risultati
		String titolo = rubrica.getName();

		// FASE 3 VERIFICA: Verifica i risultati tramite i metodi "assert"
		assertEquals("Titolo", titolo);
	}

	@Test
	public void test2() {
		// FASE 2 RISULTATI: Crea dei risultati
		rubrica.add("Mario", "Merola", 123456789);

		// FASE 3 VERIFICA: Verifica i risultati tramite i metodi "assert"
		assertNotNull(rubrica.first());
		assertEquals("Mario Merola 123456789", rubrica.first());
	}

	@Test
	public void test3() {
		// FASE 2 RISULTATI: Crea dei risultati
		rubrica.add("Mario", "Merola", 123456789);
		rubrica.add("Gino", "Paoli", 123456789);

		// FASE 3 VERIFICA: Verifica i risultati tramite i metodi "assert"
		assertEquals("Gino Paoli 123456789", rubrica.find("Paoli"));
	}

}
