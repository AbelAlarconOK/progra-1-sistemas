package tpBigO;

public class FuncionEnBloques {

	public static void imprimir(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}

	

	static boolean busquedaBinaria(int[] a, int b) {
		int izq = 0, der = a.length - 1;
		while (izq + 1 < der) {
			int m = (izq + der) / 2;
			if (a[m] == b)
				return true;

			if (a[m] < b)
				izq = m;
			else
				der = m;
		}
		return a[izq] == b || a[der] == b;

	}


	public static void funcionEnBloques(int[] a) {
		int n = a.length;// 1 OP
		int i = 0;// 1 OP
		busquedaBinaria(a, i); //LOG N
		while (i < n / 2) { //LOG N
			/* C´odigo de orden O(log n) */ 
			i++;//1 OP
		}
		while (i < n) { //N
			if (i < n / 4) {//1 OP
				/* C´odigo de orden O(nˆ3) */ //N^3
			} else {
				/* C´odigo de orden O(1) */ // (1)
			}
			i++;//1
		}
		while (i <= n + 100) {//N
			/* C´odigo de orden O(n) */ //N
			i++;// 1 OP
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ENTRADA: ARRAY
		// TAMAÑO: A.LENGHT
		// FUNCION COMPLEJIDAD: F(N)= 1 + 1 +  LOG N   + (LOG N *(LOG N * (1)))  + N *(1+N^3+(1))+(1))  + N*(N+1)
								// 2 +  LOG N + LOG N + N + N^3 + N^2  = N^3.
		// ORDEN COMPLEJO: O(N^3).

		
		
	}

}
