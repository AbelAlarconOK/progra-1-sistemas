package arreglos;

public class AgregarAlFinal {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	// Agregar(al final un entero a un arreglo de enteros.
		static int[] agregarFinal(int[] a, int x) {
			int[] b = new int[a.length + 1];
			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];
			}
			b[b.length - 1] = x;
			return b;
		}
		
		//Agregar al principui un entero a un arreglo de enteros.
		static int[] agregarPrincipio(int[] a, int x) {
			int[] b = new int[a.length + 1];
			b[0]=x;
			for (int i = 0; i < a.length; i++) {
				b[i+1] = a[i];
			}
			return b;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=0;
		int numero=5;
		int [] a = new int[4];
		a[pos++]=1;
		a[pos++]=2;
		a[pos++]=3;
		a[pos++]=4;
		imprimir(agregarFinal(a,numero));
		imprimir(agregarPrincipio(a,numero));


	}

}
