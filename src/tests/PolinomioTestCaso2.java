package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import matematica.Polinomio;

public class PolinomioTestCaso2 {

	private Polinomio p = new Polinomio(2, new double[] { 1, 0, 1 });
	private double x = 1.0;
	private double delta = 1e-15;
	private double resultado = 2;

	@Test
	public void testEvaluarMSucesivas() {
		assertEquals("Evaluar MSucesivas", p.evaluarMSucesivas(x), resultado, delta);
	}

	@Test
	public void testEvaluarRecursiva() {
		assertEquals("Evaluar evaluarRecursivas", p.evaluarRecursiva(x), resultado, delta);
	}

	@Test
	public void testEvaluarRecursivaPar() {
		assertEquals("Evaluar RecursivaPar", p.evaluarRecursivaPar(x), resultado, delta);
	}

	@Test
	public void testEvaluarProgDinamica() {
		assertEquals("Evaluar ProgDinamic", p.evaluarProgDinamica(x), resultado, delta);
	}

	@Test
	public void testEvaluarPow() {
		assertEquals("Evaluar evaluarPow", p.evaluarPow(x), resultado, delta);
	}

	@Test
	public void testEvaluarHorner() {
		assertEquals("Evaluar evaluarHorner", p.evaluarHorner(x), resultado, delta);
	}

}