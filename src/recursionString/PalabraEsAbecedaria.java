package recursionString;

public class PalabraEsAbecedaria {
	
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	public static boolean esAbecedaria(String s) {
		if(s.length()<=1) {
			return true;
		}
		if(s.charAt(0)<s.charAt(1)) {
			return esAbecedaria(resto(s));
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(esAbecedaria("abcd"));


	}

}
