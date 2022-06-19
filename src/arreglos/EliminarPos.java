package arreglos;

public class EliminarPos {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	
	// eliminar una posicion
	static int[] eliminarPos(int[] a, int pos) {
		if (0 <= pos && pos < a.length) {
			int k = 0;
			int[] b = new int[a.length - 1];
			for (int i = 0; i < a.length; i++) {
				if (i != pos) {
					b[k++] = a[i];
				}
			}
			return b;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 0;
		int numero = 0;
		int[] a = new int[4];
		a[pos++] = 1;
		a[pos++] = 2;
		a[pos++] = 3;
		a[pos++] = 4;
		imprimir(eliminarPos(a, numero));
	}

}
