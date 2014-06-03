package br.cristiano.madrugada.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import br.cristiano.madrugada.Calculadora;

public class CalcTest extends TestCase{
	private Calculadora calc;
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
		System.out.println("Teste iniciado");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Teste finalizado");
	}

	@Test
	public void test() {
		assertEquals(12.0, calc.somar(10, 2));
		assertEquals(25.0, calc.dividir(400, 16));
		assertEquals(230.0, calc.subtrair(465, 235));
		assertEquals(100.0, calc.multiplicar(25, 4));
	}

}
