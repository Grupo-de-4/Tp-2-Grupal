package matematica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

	public Polinomio(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		this.grado = sc.nextInt();
		this.coeficientes = new double[this.grado + 1];
		for (int i = 0; i <= this.grado; i++) {
			this.coeficientes[i] = sc.nextDouble();
		}
		sc.close();
	}

	// EVALUACIONES

	public double evaluarMSucesivas(double x) {
		double res = 0;
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * potenciaMSucesivas(x, i);

		return res;
	}

	public double evaluarRecursiva(double x) {
		double res = 0;
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * potencia(x, i);

		return res;
	}

	public double evaluarRecursivaPar(double x) {
		double res = 0;
		// if(grado%2==0)
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * (i % 2 == 0 ? potenciaPar(x, i) : potencia(x, i));

		return res;
	}

	public double evaluarProgDinamica(double x) {
		double res = 0;
		double[] vPot = new double[grado + 1];
		for (int i = this.grado; i >= 0; i--)
			res += coeficientes[i] * potenciaDinamica(x, i, vPot);
		return res;
	}

	public double evaluarMejorada(double x) {
		double res = 0;
		double potAnt=1;
		for (int i = this.grado; i >= 0; i--)
			//res += coeficientes[i] * potenciaDinamicaMejorada(x, i, potAnt);
			res += coeficientes[i] * (potAnt*=x);
		return res;
	}

	public double potenciaDinamicaMejorada(double x, double potAnt) {

			return potAnt*x;

		/*
		 * for(int i=1; i<=n; i++) { if(vPot[i]==0) vPot[i] = vPot[i-1] * x; }
		 * 
		 * return vPot[n];
		 */
	}

	public double evaluarPow(double x) {
		double res = 0;
		if (grado % 2 == 0)
			for (int i = this.grado; i >= 0; i--)
				res += coeficientes[i] * Math.pow(x, i);

		return res;
	}

	public double evaluarHorner(double x) {
		double res = 0;
		for (int i = 0; i <= grado; i++) {
			res = res * x + coeficientes[i];
		}
		return res;
	}

	// POTENCIAS
	public double potenciaMSucesivas(double x, int n) {
		double res = 1;
		for (int i = 0; i < n; i++)
			res *= x;
		return res;
	}

	public double potencia(double x, int n) {
		if (n == 0)
			return 1;
		return x * potencia(x, n - 1);
	}

	public double potenciaPar(double x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return x;
		return potenciaPar(x * x, n / 2);
	}

	public double potenciaDinamica(double x, int n, double[] vPot) {
		if (n == 0)
			return 1;

		if (vPot[n] == 0)
			vPot[n] = potencia(x, n - 1);

		return x * vPot[n];
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(this.coeficientes[this.grado] + "x^" + this.grado);
		for (int i = this.grado; i > 0; i--)
			res.append(" + " + this.coeficientes[i] + "x^" + i);

		return res.toString();
	}
}
