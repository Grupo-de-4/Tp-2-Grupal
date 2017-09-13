package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import matematica.Polinomio;

public class PolinomioTest {

	@Test
	public void PolinomiocompletoG2E2() {
		Polinomio p = new Polinomio(2,new double[]{1,1,1});
		System.out.println(p.toString());
		assertEquals("p.toString()",0, 1);
	}

}
