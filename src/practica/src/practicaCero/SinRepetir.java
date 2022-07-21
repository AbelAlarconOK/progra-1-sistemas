package practicaCero;

public class SinRepetir {

	public static boolean Aparece(String a, char b) {
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b) {
				return true;
			}
		}
		return false;
	}

	public static void sinRepetidos(String palabra) {
		String nueva = "";
		for (int j = 0; j < palabra.length(); j++) {
			if (Aparece(nueva, palabra.charAt(j)) ==false) {
				nueva = nueva + palabra.charAt(j);
			}
		}System.out.println(nueva);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinRepetidos("ananaporop");
	}

}