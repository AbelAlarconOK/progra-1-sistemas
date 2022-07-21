package bigO;

public class BusquedaBinaria {

	static boolean busquedaBinaria(int[] a, int b) {
		int izq = 0, der = a.length - 1;
		while (izq + 1 < der) {
			int m = (izq + der) / 2;
			if (a[m] == b)
				return true;

			if (a[m] < b)
				izq = m;
			else
				der = m;
		}
		return a[izq] == b || a[der] == b;

	}
}
