package recursionString;

public class ImprimirEspaciadoAesteriscos {
	
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	public static String imprimirEspaciado(String s) {
		if (s.length() == 0) {
			return "";
		} else {
			return s.charAt(0) + " " + imprimirEspaciado(resto(s));
		}
	}
	
	public static void imprimirAsteriscos1(String s) {
		if (s.length() == 0) {
			return;
		}
		if (s.length() == 1) {
			System.out.print(s.charAt(0));
			return;
		}
		System.out.print(s.charAt(0) + "*");
		imprimirAsteriscos1(resto(s));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal = "banana";
		imprimirAsteriscos1(pal);
		System.out.println("\n"+imprimirEspaciado(pal));
		
	}

}
