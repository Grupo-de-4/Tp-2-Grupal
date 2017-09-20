package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import polinomio.Polinomio;

public class PolinomioTestCaso4 {
	
	private Polinomio p = new Polinomio(2, new double[] { 0, 0, 15 });
	private double x= 10.0;
	private double delta = 1e-15;
	private double resultado = 15;
	
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
