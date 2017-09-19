package tests;

import matematica.Polinomio;

public class ProbandoTiemposEjecucion {

	public static void main(String[] args) {
		
		//Calendar tiempoIni;
		//Calendar tiempoFin;
		long tInicio, tFin, tTotal;
		//*******EL TIEMPO ES MEDIDO EN NANOSEGUNDOS Y PASADO A MICROSEGUNDOS*******
		
		//************************* CASO 1 ********************************************
		System.out.println("CASO 1");
		Polinomio p = new Polinomio(2, new double[] { 1, 1, 1 });
		double x= 1.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);
		
		
		//************************* CASO 2 ********************************************
		System.out.println("\nCASO 2");
		p = new Polinomio(2, new double[] { 1, 0, 1 });
		x= 1.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);
		
		
		//************************* CASO 3 ********************************************
		System.out.println("\nCASO 3");
		p = new Polinomio(2, new double[] { 1, 1, 1 });
		x= 3.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);
		
		
		//************************* CASO 4 ********************************************
		System.out.println("\nCASO 4");
		p = new Polinomio(0, new double[] { 0, 0, 15 });
		x= 10.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);
		
		
		//************************* CASO 5 ********************************************
		System.out.println("\nCASO 5");
		p = new Polinomio(3, new double[] { -1, -1, -1, -5 });
		x= 2.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);
		
		//************************* CASO 6 ********************************************
		System.out.println("\nCASO 6");
		p = new Polinomio(2, new double[] { 1, 1, 1 });
		x= -3.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);
		
		//************************* CASO 7 ********************************************
		System.out.println("\nCASO 7");
		p = new Polinomio(2, new double[] { 2, 3, 4 });
		x= 1.0;
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMSucesivas(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMSucesivas: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursiva(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursiva: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarRecursivaPar(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarRecursivaPar: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarProgDinamica(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarProgDinamica: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarMejorada(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarMejorada: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarPow(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarPow: " + tTotal);
		
		tInicio = System.nanoTime() / 1000;
		p.evaluarHorner(x);
		tFin = System.nanoTime() / 1000;
		tTotal = tFin - tInicio;
		System.out.println("Tiempo en microsegundos evaluarHorner: " + tTotal);

	}

}
