package arreglos;

public class Promedio {
	
	public static double promedio(int[] a) {
		int  suma_doble = 0;
		for (int i = 0; i < a.length; i++) {
			suma_doble = suma_doble + a[i];
		}
		return suma_doble / a.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated	int pos=0;
		int pos=0;
		int [] a = new int[4];
		a[pos++]=1;
		a[pos++]=2;
		a[pos++]=3;
		a[pos++]=4;
		System.out.println(promedio(a));
	}
	
}
