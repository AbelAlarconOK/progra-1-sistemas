package resolucion;

public class Smain {
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	
	public static boolean estaIncluida(String s, String s2) {
		if(s.length()>0&&s2.equals("")||(s2.length()>0&&s.equals(""))) {
			return false;
		}
		if(s2.length()> s.length()) {
			return false;
		}
		if(s2.charAt(0)==s.charAt(0)) {
			 estaIncluida(resto(s),resto(s2));
		}else {
			 estaIncluida(resto(s), (s2));
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "calidad";
		String b = "alapihiuyiu";

		System.out.println(estaIncluida(a,b));
	}

}
