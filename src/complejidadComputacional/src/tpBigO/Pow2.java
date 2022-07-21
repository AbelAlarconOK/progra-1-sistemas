package tpBigO;

public class Pow2 {

	public static int pow2(int n) {
		if (n == 0)// 1 OP
			return 1;// 1 OP
		else
			return pow2(n - 1)+ pow2(n - 1); // N-1 + N-2 + 2 CASO BASE
	}
	
	public static int pow3(int n) {
		if (n == 0)// 1 OP
			return 1;// 1 OP
		else
			return 2 *  pow3(n-1); // 2*  N-1 +2 CASO BASE
	}
	
	//LA FUNCION MULPILICA POR 2 LA CANTIDAD DE N VECES.

	public static void main(String[] args) {
		
		
		System.out.println(pow2(3));
		//ENTRADA: INT N.
		//TAMAÑO: N.
		//FUNCION COMPLEJIDAD: F(N)= 1+1+((N-1)+(N-1))+ 2 CASO BASE
		//ORDEN COMPLEJIDAD: O(N^2).
		
		System.out.println(pow3(3));
		System.out.println(pow3(4));

		//ENTRADA: INT N.
		//TAMAÑO: N.
		//FUNCION COMPLEJIDAD: F(N)= 1+1+(2*(N-1)) + 2 CASO BASE
		//ORDEN COMPLEJIDAD: O(N).	
	}
}
