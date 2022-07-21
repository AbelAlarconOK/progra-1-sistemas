package bigO;

public class CambiarNumeros {

	public static void cambiarNumeros(int[] a) {
		for (int i = 0; i < a.length; i++) {// N REPETICIONES
			int max = a[0];// 1 OP
			for (int j = 0; j < a.length; j++) {// N REPETICIONES
				if (a[j] > max) {// 1OP
					max = a[j];// 1OP
				}
			}
			if (a[i] > max / 2) {// 2 OP
				a[i] = max / 2; // 2 OP
			}
		}
	}

	public static void cambiarNumeros2(int[] a) {
		int max = a[0];// 1 OP
		for (int j = 0; j < a.length; j++) {// N REPETICIONES
			if (a[j] > max) {// 1OP
				max = a[j];// 1OP
			}
		for (int i = 0; i < a.length; i++) {// N REPETICIONES
			if (a[i] > max / 2) {// 2 OP
				a[i] = max / 2; // 2 OP
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * MAYORMEENTE CUANDO TENEMOS CICLOS ANIDADOS EL ORDEN COMPLEJO SERA
		 * EXPONENCIAL.
		 */

		//CAMBIARNOMBRE
		// ENTRADA: ARRAY
		// TAMAÑO: A.LENGHT
		// FUNCION COMPLEJIDAD: N*(1+(N*(1+1))+(1+1))= n*(+3(2N)) = 3N*2n^2.
		// ORDEN COMPLEJO: O(N^2).
		
		//CAMBIARNOMBRE2
		// ENTRADA: ARRAY
		// TAMAÑO: A.LENGHT
		// FUNCION COMPLEJIDAD: 1+N*(1+1)+N*(2+2)= 1+6N. 
		// ORDEN COMPLEJO: O(N).
		
	}

}
