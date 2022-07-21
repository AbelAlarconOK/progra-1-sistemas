package practicaCero;

public class PotenciaFactorial {
	public static  double potencia(double x, int y) {
		double resultado =1;
		for (int i=1; i <=y; i++) {
			resultado = resultado*x;
		}
		return resultado;
	}
	
	public static int  factorial(int n) {
		int factorial = 1;
		for(int i=2; i<=n;i++) {
			factorial = factorial*i;
		}return factorial;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(potencia(2,5));
		System.out.println(factorial(10));
	}


}
