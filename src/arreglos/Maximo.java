package arreglos;

public class Maximo {

	public static int maximo(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	
	public static int posicionMaximo(int [] a) {
		int max = a[0];
		int pos= 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				pos=i;
			}
		}
		return pos;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {62,3,4,40,2,52,10,7,55};
		System.out.println(maximo(a));
		System.out.println(posicionMaximo(a));
		
	}

	
}
