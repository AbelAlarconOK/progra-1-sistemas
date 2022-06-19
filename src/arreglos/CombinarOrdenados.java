package arreglos;

public class CombinarOrdenados {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	static int[] combinarOrdenados(int[] a, int[] b) {// dados dos
		// arreglos ordenado de menor a mayor, construir otro con
		// los elementos de ambos y que quede ordenado
		int[] c = new int[a.length + b.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else if (a[i] > b[j]) {
				c[k++] = b[j++];
			} else {
				c[k++] = b[j++];
				i++;
							}
		}
		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = b[j++];
		}

		int[] d = new int[k];
		for (int h = 0; h < k; h++) {
			d[h] = c[h];
		}
		return d;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1, 3, 5, 8, 10, 11, 12,14,15,16,17,18 };
		int[] y = { 2,4, 5, 7, 9, 10, 12, 13, 15, 20 };
		int[] z = combinarOrdenados(x, y);
		imprimir(z);
	}

	

}
