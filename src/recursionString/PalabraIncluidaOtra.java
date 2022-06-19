package recursionString;

public class PalabraIncluidaOtra {
	
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	public static boolean PalabraEstaIncluida(String s, String s2) {
		if(s2.equals("")) {
			return true;
		}
		if(s.equals("")) {
			return false;
		}
		if(s2.charAt(0)==s.charAt(0)) {
			  return PalabraEstaIncluida(resto(s),resto(s2));
		}else {
			return PalabraEstaIncluida(resto(s), (s2));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "calidad";
		String b = "ala";

		System.out.println(PalabraEstaIncluida(a,b));
	}

}
