package excepciones;

public class ExceRuntimeExc {

	public static int sumarHasta(int n) {
		if (n <0) {
			throw new RuntimeException("Error:\n" + n + " es menor o igual a cero");
		}
		if(n==0) {
			return 0;
		}
		return n + sumarHasta(n - 1);
	}
	
	public static int maximo(int []a) {
		if(a.length==0) {
			throw new RuntimeException("Error: Array vacio");
		}
		int max = a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =-2;
		int [] n2 = {};
		try {
			System.out.println(sumarHasta(n));
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			System.out.println(maximo(n2));
		}catch(Exception ex2){
			System.out.println(ex2.getMessage());
		}
	}
}
