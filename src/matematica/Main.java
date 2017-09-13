package matematica;

public class Main {

	public static void main(String[] args) {
		Polinomio p = new Polinomio(2, new double[] { 1, 1, 1 });
		System.out.println(p.toString());
		System.out.println("Multiplicaciones: " + p.evaluarMSucesivas(1.0));
		System.out.println("Recursiva: " + p.evaluarRecursiva(1.0));
		System.out.println("RecursivaPar: " + p.evaluarRecursivaPar(1.0));
		System.out.println("RecursivaDinamica: " + p.evaluarProgDinamica(1.0));
	}

}
