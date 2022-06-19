package arreglos;

public class EliminarElemento {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	// determinar si un elemento pertenece a un arreglo
		static boolean pertenece(int[] a, int e) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == e)
					return true;
			}
			return false;
		}
	
	
	// eliminar un elemento x de un arreglo
		static int[] eliminar(int[] a, int x) {
			if (pertenece(a, x)) {
				int k = 0;
				int[] b = new int[a.length - 1];
				for (int i = 0; i < a.length; i++) {
					if (a[i] != x) {
						b[k] = a[i];
						k++;// equivale a:
						// b[k] = a[i]; k++;
					}
				}
				return b;
			}
			return a;
		}


		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=0;
		int numero=3;
		int [] a = new int[4];
		a[pos++]=1;
		a[pos++]=2;
		a[pos++]=3;
		a[pos++]=4;
		imprimir(eliminar(a,numero));
	}


}
