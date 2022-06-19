package arreglos;

public class Pertenece {

	// determinar si un elemento pertenece a un arreglo
		static boolean pertenece(int[] a, int e) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == e)
					return true;
			}
			return false;
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int pos=0;
			int numero=0;
			int [] a = new int[4];
			a[pos++]=1;
			a[pos++]=2;
			a[pos++]=3;
			a[pos++]=4;
			System.out.println(pertenece(a,numero));
		}

	
}
