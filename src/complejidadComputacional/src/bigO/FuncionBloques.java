package bigO;

public class FuncionBloques {

	public static void funcionBloques(int n) {
		int i = 1;// 1 OP
		while (i < n - 20) { //N-20
			/*
			 * bloque de código de orden O(log n) //LOG N
			 */

			i++; //1OP
		}
		while (i < n) { // 20 ITERACIONES
			/*
			 * bloque de código de orden O( n) //N
			 */

			i++;//1OP
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENTRADA: N.
		//TAMAÑO ENTRADA: N.
		//FUNCIONE COMPLEJIDAD: F(N)= 1 + (N-20)*(LOG (N) + 1) + 20 *(N+1) = O(1)+ O(N*LOG (N)) + O(N).
		//ORDEN DE COMPLEJIDAD: O(N*LOG (N)).
	}

}
