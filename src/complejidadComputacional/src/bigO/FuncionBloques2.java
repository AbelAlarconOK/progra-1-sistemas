package bigO;

public class FuncionBloques2 {
	
	public static void funcionBloques(int n) {
		   int i=1;// 1 OP
		   while (i < n/2) { // LOG N
		      /* bloque de código de orden O(n^2) */
		      i++;// 1OP
		   }
		   while (i < n) { // N
		      /* bloque de código de orden O(log( n)) */
		      i++;// 1OP
		   }
		   while (i < n + 100) { //N+100
		      /* bloque de código de orden O(n^3) */
		      i++;//1OP
		   }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENTRADA: INT N.
		//TAMAÑO: N.
		//FUNCION COMPLEJIDAD: 1+ ((LOG N) * (N^2) + 1) + (N*(LOG N)+1) + ((N+100)*(N^3) +1)
							 //O(1) + O(N LOG N)   +  O(N LOG N) + O(N^3)
		//ORDEN COMPLEJIDAD: O(N^3).

	}

}
