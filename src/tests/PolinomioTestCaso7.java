package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import polinomio.Polinomio;

public class PolinomioTestCaso7 {
	
	private Polinomio p = new Polinomio(2, new double[] { 2, 3, 4 });
	private double x= 1.0;
	private double delta = 1e-15;
	private double resultado = 9;
	
	@Test
	public void testEvaluarMSucesivas() {
		assertEquals("Evaluar MSucesivas",p.evaluarMSucesivas(x),resultado,delta);
	}
	
	@Test
	public void testEvaluarRecursiva() {
		assertEquals("Evaluar evaluarRecursivas",p.evaluarRecursiva(x),resultado,delta);
	}
	
	@Test
	public void testEvaluarRecursivaPar() {
		assertEquals("Evaluar RecursivaPar",p.evaluarRecursivaPar(x),resultado,delta);
	}
	
	@Test
	public void testEvaluarProgDinamica() {
		assertEquals("Evaluar ProgDinamic",p.evaluarProgDinamica(x),resultado,delta);
	}
	@Test
	public void testEvaluarPow() {
		assertEquals("Evaluar evaluarPow",p.evaluarPow(x),resultado,delta);
	}
	
	@Test
	public void testEvaluarMejorada(){
		assertEquals("Evaluar ProgDinamicaMej",p.evaluarMejorada(x),resultado,delta);
	}
	
	@Test
	public void testEvaluarHorner(){
		assertEquals("Evaluar Horner",p.evaluarHorner(x),resultado,delta);
	}

}
