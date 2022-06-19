package recursionString;

public class RepetirCharCantidadDeVeces {
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static String repetirChar(String s, char c, int n) {
		if (s.length() == 0 || n == 0) {
			return s;
		}
		if (s.charAt(0) == c) {
			return "" + s.charAt(0) + repetirChar(s, c, n - 1);
		} else {
			return "" + s.charAt(0) + repetirChar(resto(s), c, n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repetirChar("mesa", 'a', 5));
	}

}
