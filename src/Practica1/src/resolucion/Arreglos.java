package resolucion;

import java.util.Arrays;

public class Arreglos {
	int edad;

	public Arreglos(int age) {
		this.edad = age;
	}

	
	
	// METODO DE CLASE:

	public static boolean esSinRepetir(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[] concatenarArray(int[] arr, int[] arr2) {
		int[] nuevo = new int[arr.length + arr2.length];
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			nuevo[pos++] = arr[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			nuevo[pos++] = arr2[j];
		}
		return nuevo;
	}

	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	public static int[] agregarFinal(int[] a, int x) {
		int[] b = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = x;
		return b;
	}
	
	
	static boolean pertenece(int[] a, int e) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == e)
				return true;
		}
		return false;
	}

	static int[] eliminar(int[] a, int x) {
		if (pertenece(a, x)) {
			int pos = 0;
			int[] b = new int[a.length - 1];
			for (int i = 0; i < a.length; i++) {
				if (a[i] != x) {
					b[pos] = a[i];
					pos++;// equivale a:
					// b[pos] = a[i]; pos++;
				}
			}
			return b;
		}

		return a;
	}
	
		
	static int[] eliminarPos(int[] a, int posicion) {
		if (0 <= posicion && posicion < a.length) {
			int pos = 0;
			int[] b = new int[a.length - 1];
			for (int i = 0; i < a.length; i++) {
				if (i != pos) {
					b[pos++] = a[i];
				}
			}
			return b;
		}
		return a;
	}
	
	public static int cantidadRepetidos(int[] arr) {
		Arrays.sort(arr);
		int cont=0;
		int aux=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(aux==arr[i]) {
				cont++;
				}else {
					aux=arr[i];
				}
		}
		return cont;
	}

	public static int[] sinRepetir(int[] arr) {
		int pos = 0;
		int repetidos = cantidadRepetidos(arr);
		int[] nuevo = new int[arr.length - repetidos];
		for (int i = 0; i < arr.length; i++) {
			if (pertenece(nuevo, arr[i])) {
				eliminar(nuevo, arr[i]);
			} else {
				nuevo[pos] = arr[i];
				pos++;
			}

		}
		return nuevo;
	}

	public static int[] inverso(int[] arr) {
		int pos = 0;
		int[] nuevo = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			nuevo[pos] = arr[i];
			pos++;
		}
		return nuevo;
	}

}
