package practicaCero;

public class EstaOrdenado {

	public static boolean menorMayor(int[] a) {
		if (a.length<=1) {
			return true;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(menorMayor(a));

	}
}
