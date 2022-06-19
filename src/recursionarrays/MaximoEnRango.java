package recursionarrays;

public class MaximoEnRango {
	
	public static int maxEnRango(int[] a, int b, int c) {
		if (b == c) {
			return a[b];
		}
		int maxResto = maxEnRango(a, b+1 , c);
		if (maxResto > a[b]) {
			return maxResto;
		} else {
			return a[b];
		}
	}

	public static int maximo(int[] a) {
		return maxEnRango(a, 0, a.length - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 3, 4, 10, 5, 8 };
		System.out.println(maximo(a));
		System.out.println(maxEnRango(a,0,4));


	}

}
