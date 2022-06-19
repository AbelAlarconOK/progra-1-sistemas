package recursionarrays;

public class NumeroPerteneceArrays {

	public static boolean pertenece(int[] a, int n, int indice) {
		if (indice == a.length) {
			return false;
		} else if (a[indice] == n) {
			return true;
		} else {
			return pertenece(a, n, indice + 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[6];
		int pos;
		int n;
		int indice;
		pos = 0;
		n = 6;
		indice = 5;
		array[pos++] = 1;
		array[pos++] = 2;
		array[pos++] = 3;
		array[pos++] = 4;
		array[pos++] = 5;
		array[pos++] = 6;
		System.out.println(pertenece(array, n, indice));
	}

}
