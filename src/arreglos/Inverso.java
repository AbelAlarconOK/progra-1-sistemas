package arreglos;

public class Inverso {

	public static void imprimirInverso(int[] arr) {
		System.out.print("[ ");
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	

	
	public static void main(String[] args) {
		int pos=0;
		int[] a = new int[4];
		a[pos++] = 1;
		a[pos++] = 2;
		a[pos++] = 3;
		a[pos++] = 4;
		imprimirInverso(a);
	}
}
