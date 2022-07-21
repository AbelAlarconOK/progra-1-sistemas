package bigO;

public class RecursionRaro {
	
	public static double raro(int n) {
		   if (n <= 1) { //1 OP
		      return 1; //1 op
		   }
		   return 1 + 1/raro(n-1); // N-1 MAS 2 OPERACIONES
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENTRADA: INT N.
		//TAMAÑO: N.
		//FUNCION COMPLEJIDAD: F(N) (N-1)*(1+1+2)+ 2OPERACIONES DEL CASO BASE.
		//ORDEN DE COMPLEJIDAD: O(N).
	}

}
