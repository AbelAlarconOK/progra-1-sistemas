package tpBigO;

public class RunningSum {
	
	
	public static void imprimir(int [] a) {
		System.out.print("[ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}

	/*1. El siguiente metodo devuelve un nuevo arreglo con las sumas acumuladas parciales de
	    *los elementos del arreglo pasado como parametro.*/
	
	public static int[] runningSum(int[] a) {
		int[] b = new int[a.length];//1 OP
		for (int i = 0; i < a.length; i++) {// N OP
			int suma = 0;//1 P
			for (int j = 0; j <= i; j++)// N OP
				suma = suma + a[j];//1OP
			b[i] = suma;//1OP
		}
		return b;
	}
	
	/*2. Escriba un metodo que devuelva exactamente lo mismo que el algoritmo del Ejercicio 1
		pero con un orden de complejidad menor. Justificar el mismo con palabras y/o lenguaje
		matematico.*/
	
	
	public static int[] runningSum2(int[] a) {
		int[] b = new int[a.length];//1 OP
		int suma = 0;//1 P
		for (int i = 0; i < a.length; i++) {// N OP
			suma+=a[i];//1OP
			b[i] = suma;//1OP
		}
		return b;
	}
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {1,2,3,4,5,6,7,9};
		imprimir(runningSum(numeros));
		
		System.out.println();
		
		int [] numeros2 = {1,2,3,4,5,6,7,9};
		imprimir(runningSum2(numeros2));
		
		// 1:
		// ENTRADA: ARRAY
		// TAMAÑO: A.LENGHT
		// FUNCION COMPLEJIDAD: 1 + N *(1+N*(1)+1)+1 = 2+ N * 2N = 2+ N^2.
		// ORDEN COMPLEJO: O(N^2).
		
		
		// 2:
		// ENTRADA: ARRAY
		// TAMAÑO: A.LENGHT
		// FUNCION COMPLEJIDAD: 1 + 1 + N *(1+1) = 2+ 2N.
		// ORDEN COMPLEJO: O(N).
		
	}

}
