package tpBigO;

public class CopiaCiclica {
	
	public static void imprimir(int [] a) {
		System.out.print("[ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
	
	/*3.El siguiente metodo construye y retorna un arreglo de tamaño m, 
	 * usando los elementos delarreglos de forma ciclica */
	
	public static int[] copiaCiclica(int[] a, int m) {
		int[] b = new int[m];//1 OP
		int i = 0;//1OP
		while (i < m) {//N
			for (int j = 0; j < a.length && i < m; j++) {//N
				b[i] = a[j];//1OP
				i++;//1OP
			}
		}
		return b;//1OP
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int [] numeros = {1,2,3,4,5,6,7,9};
		
		imprimir(copiaCiclica(numeros, 1));
		
		// 3:
		// ENTRADA: ARRAY
		// TAMAÑO: A.LENGHT
		// FUNCION COMPLEJIDAD: F(N,M)= 1 + 1 + N *(N*(1+1))+1 = 3+ (N * 2N) = 3 + N^2.
		// ORDEN COMPLEJO: O(N^2).
		

	}

}
