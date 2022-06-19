package arreglos;

public class Intercalar {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	
	
	public static int[] intercalar(int[] a, int[] b) {
		int[] nuevo = new int[a.length + b.length];
		int pos = 0;
		int n = Math.min(a.length, b.length);

		for (int i = 0; i < n; i++) {
			nuevo[pos++] = a[i];
			nuevo[pos++] = b[i];
		}
		if (n < a.length) {
			for (int i = n; i < a.length; i++) {
				nuevo[pos++] = a[i];
			}
		} else {
			for (int i = n; i < b.length; i++) {
				nuevo[pos++] = b[i];
			}
		}
		return nuevo;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_uno = { 1, 3, 5, 7, 9, };
		int[] arr_dos = { 2, 4, 6, 8, 10 };
		imprimir(intercalar(arr_uno,arr_dos));
	}
}
