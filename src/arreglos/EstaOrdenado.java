package arreglos;

public class EstaOrdenado {
	static boolean estaOrdenado(int[] a) { // debe ser a.length >=2
		if (a.length <= 1)
			return true;
		for (int i = 1; i < a.length; i++) {
			if (a[i - 1] > a[i])
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 11 };
		boolean resultado = estaOrdenado(a);
		System.out.println(resultado);
	}

}
