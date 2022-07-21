package bigO;

public class FuncionRaro2 {
	
	
	public static double raro2(int n) {
		   if(n <= 1) { //1OP
		      return 1;//1OP
		   }
		   return 1 + 1/raro2(n/2); //LOG 2 MAS 2OPERACIONES DEL CASO BASE. 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ENTRADA: INT N.
		//TAMAÑO: N.
		//FUNCION COMPLEJIDAD: F(N) (LOGS N)*(1+1+2)+2.
		//ORDEN COMPLEJIDAD: O(LOG N).

	}

}
