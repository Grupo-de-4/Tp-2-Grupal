package matematica;

import java.util.Arrays;

public class Polinomio {
	private int grado;
	private double[] coeficientes;

	public Polinomio() {
		this.grado = 1;
		this.coeficientes = new double[1];
	}

	public Polinomio(int g, double[] c) {
		this.grado = g;
		this.coeficientes = new double[g + 1];
		System.arraycopy(c, 0, this.coeficientes, 0, g + 1);
	}

	//EVALUACIONES
	
	public double evaluarMSucesivas(double x) {
		double res = 0;
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * potenciaMSucesivas(x, i); //O(n^2)

		return res;
	}

	public double evaluarRecursiva(double x) {
		double res = 0;
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * potencia(x, i);		//O(n) por el ciclo, O(n) por la potencia, O(n^2)

		return res;
	}
	
	public double evaluarRecursivaPar(double x) {
		double res = 0;
		if(grado%2==0)
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * (x % 2 == 0 ? potenciaPar(x, i) : potencia(x, i)); //O(n) *(Log[n] + O(n))
																						//= O(n^2)
		return res;													
	}

	public double evaluarProgDinamica(double x) {
		double res = 0;
		double []vPot= new double[grado+1];
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * potenciaDinamica(x, i, vPot);	//O(n) por el ciclo, pero las potencias 
		return res;													//solo se calculan una sola vez O(n)
	}																//asi que seria O(n) + O(n) = O(n)
	
	public double evaluarPow(double x) {
		double res = 0;
		if(grado%2==0)
		for (int i = this.grado; i >= 0; i--)			//O(n) * O(pow)
			res += coeficientes[i] * Math.pow(x, i);

		return res;
	}
	
	public double evaluarHorner(double x)
	{
		double res=0;
		
		for(int i = 0; i<=grado; i++)
		{
			res = res*x + coeficientes[i];
		}
		
		return res;
	}
	
	
	//POTENCIAS
	public double potenciaMSucesivas(double x, int n) 	//Complejidad
	{
		double res=x;									// 1
		for(int i=0; i<n; i++)							// n
			res*=x;											// 1
		return res;										//TOTAL O(n*1 +1) = O(n)
	}
	
	public double potencia(double x, int n) {			//Complejidad
		if (n == 0)										// 1
			return 1;	
		return x * potencia(x, n - 1);					// Lineal, llamado n veces	== TOTAL O(n+1) = O(n)
	}

	public double potenciaPar(double x, int n) {		//Complejidad
		if (n == 1)
			return x;									// 1
		return potenciaPar(x * x, n / 2);				// Log[n] = TOTAL O(Log[n] + 1) = O(Log[n])
	}


	public double potenciaDinamica(double x, int n, double[] vPot) {
		if (n == 0)
			return 1;									// 1
		
		if(vPot[n]==0)									//
			vPot[n]=potencia(x, n - 1);					// 	n
		
		return x * vPot[n];								// 1, TOTAL O(1+1+n) = O(n)
	}

	/*
	 * double evaluarMejorada(double x) { }
	 * 
	 * double evaluarPow(double x) { }
	 * 
	 * double evaluarHorner(double x) { }
	 */

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(this.coeficientes[this.grado] + "x^" + this.grado);
		for (int i = this.grado; i > 0; i--)
			res.append(" + " + this.coeficientes[i] + "x^" + i);

		return res.toString();
	}
}
