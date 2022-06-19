package recursionint;

public class Potencia {

	public static double potencia(int base,int exponente ) {
		if(exponente==0) {
			return 1;
		}else {
			return base*potencia(base,exponente-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=3;
		int exponente=5;
		System.out.println(potencia(base,exponente));
	}

}
