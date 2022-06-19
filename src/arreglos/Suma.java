package arreglos;

public class Suma {

	
	public static int suma(int [] a) {
		int suma = 0;
		for(int i = 0;i<a.length;i++) {
			suma = suma + a[i];
		}return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [5];
		a [0]= 1;
		a [1]= 2;
		a [2]= 3;
		a [3]= 4;		
		System.out.println(suma(a));
	}
}
