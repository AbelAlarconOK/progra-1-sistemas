package recursionint;

public class CantidadPrimosEntreDosInt {
	
	static boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return  true;
	}
	
	public static int cantidadPrimosEntre(int n, int m) {
		if (n > m) {
			return 0;
		} 	// analizar el m
			// usamos cantidadPrimosEntre(n,m-1)
		if (esPrimo(m)) {
			return 1 + cantidadPrimosEntre(n, m - 1);
		} else {
			return cantidadPrimosEntre(n, m - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int m =15;
		
		System.out.println(cantidadPrimosEntre(n,m));
		
	}

}
