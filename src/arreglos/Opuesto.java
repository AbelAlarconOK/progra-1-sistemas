package arreglos;

public class Opuesto {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	public static int [] opuesto(int[] a) {
		int[] b = new int[a.length ];
		int pos=0;
		for(int i =0;i<a.length;i++) {
			b[pos++]=a[i]*-1;
		}return b;
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 0;
		int[] a = new int[4];
		a[pos++] = 1;
		a[pos++] = 2;
		a[pos++] = 3;
		a[pos++] = 4;
		imprimir(opuesto(a));
	}


}
