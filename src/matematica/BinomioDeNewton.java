package matematica;

public class BinomioDeNewton {

	private double a;
	private double b;
	private int n;


	public BinomioDeNewton( double a, double b, int n )
	{
		this.a = a;
		this.b = b;
		this.n = n;
	}




	public double coeficienteCombinatorio( int k ){

		if( k < 0 || k > n )
			return 0;

		long  comb = 1;

		//calcula el numero combinatorio n / k
			for (double i = this.n; i > n - k  && i > 1  ; i--) {
				comb *= i;
			}
			for (double i = k; i > 0 ; i--) {
				comb /= i;
			}

		return comb ;
	}

    public Polinomio obtenerPolinomioCombinatorio(){

    	double coeficientes[] = new double[n + 1];

    	for (int i = 0; i < n + 1; i++) {
		    coeficientes[i] = this.coeficienteCombinatorio(i) * Math.pow(a, i) * Math.pow( b, n-i);
		}

    	return new Polinomio(this.n, coeficientes );
	}




	public double coeficienteDiviciones( int k ){
		if( k < 0 || k > n )
			return 0;

		int num = n;
		double res = 1;

	    for(int denom = 1; denom <= k; denom++, num--)
	    {
	    	res = res * num / denom;
	    }

	    return  res ;
	}

    public Polinomio obtenerPolinomioDiviciones(){

    	double coeficientes[] = new double[n + 1];

    	for (int i = 0; i < n + 1; i++) {
		    coeficientes[i] = this.coeficienteDiviciones(i) * Math.pow(a, i) * Math.pow( b, n-i);
		}

    	return new Polinomio(this.n, coeficientes );
	}





	public double coeficienteRecursivo( int k) {
	    if( k < 0 || k > this.n)
	    	return 0;
	    if( this.n == 1 || k == n || k == 0)
	    	return 1;

	    return coeficienteRecursivo( this.n - 1, k-1) + coeficienteRecursivo( this.n -1, k)  ;
	}
	public long coeficienteRecursivo( int r, int k) {
	    if(r == 1 || k < 1 || k >= r)
	    	return 1;
	    return coeficienteRecursivo( r - 1 , k-1) + coeficienteRecursivo( r - 1, k);
	}

    public Polinomio obtenerPolinomioRecursivo(){

    	double coeficientes[] = new double[n + 1];

    	for (int i = 0; i < n + 1; i++) {
		    coeficientes[i] = this.coeficienteRecursivo(i) * Math.pow(a, i) * Math.pow( b, n-i);
    	}

    	return new Polinomio(this.n, coeficientes );
	}







	public int[][] coeficienteDinamicoNoRecursivo() {

		int [][] mat = new int[this.n + 1][this.n + 1];

		// llena los bordes con 1:
		for(int i = 1; i < this.n + 1; i++) {
			mat[i][0] = 1;
			mat[0][i] = 1;
		}

		//llena el resto de la matriz:
		for(int i = 1; i < this.n ; i++) {
			for(int j = 1; j < this.n ; j++) {
				mat[i][j] = mat[i][j-1] + mat[i-1][j];
			}
		}

		return mat;
	}


    public Polinomio obtenerPolinomioDinamicoNoRecursivo(){

    	double coeficientes[] = new double[n + 1];

    	int[][] matriz = this.coeficienteDinamicoNoRecursivo();


		for(int j = 0; j < this.n + 1 ; j++ ){
			coeficientes[j] = matriz[n-j][j] * ( Math.pow(a, j) * Math.pow( b, n-j) );
		}

    	return new Polinomio(this.n, coeficientes );
	}



	@Override
	public String toString() {
		return "BinomioDeNewton = (" + a + "x + " + b + ")^" + n + "   ";
	}

}
