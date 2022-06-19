package recursionint;

public class Sumar {
	
	public static int sumarHasta(int n) {
		// obtener 1+2+3+...+n para n>=0
		if (n == 0) {
			return 0;
		}
		return n + sumarHasta(n - 1);
	}
	
	public static void imprimirHasta(int n) {
		if(n==1) {
			System.out.print("1");
			return;//Cortarlo sin que devuelva nada.
		}
		imprimirHasta(n-1);
		System.out.print(n);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		imprimirHasta(n);
		System.out.println(" ");
		System.out.println(sumarHasta(n));
	}

	
	

}
