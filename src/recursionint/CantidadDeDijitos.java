package recursionint;

public class CantidadDeDijitos {
		
	public static int cantidadDigitos(int n) {
		int cantidad=1;
		if(n==0) {
			return 0;
		}
		return cantidad+(cantidadDigitos(n/10));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=10000;
		System.out.println(cantidadDigitos(numero));


	}

}
