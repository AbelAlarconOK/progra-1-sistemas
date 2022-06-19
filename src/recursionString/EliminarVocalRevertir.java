package recursionString;

public class EliminarVocalRevertir {
	
	public static boolean esVocal(char x) {
		String vocales = "aeiou";
		if(vocales.indexOf(x)==-1) {
			return false;
		}
		return true;
	}
	
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	public static String eliminarVocRevertir(String s) {
		if(s.equals("")) {
			return s;
		}
		if(esVocal(s.charAt(0))){
			return ""+eliminarVocRevertir(resto(s));
		}else {
			return""+eliminarVocRevertir(resto(s))+s.charAt(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animal= "zapallo";
		System.out.println(eliminarVocRevertir(animal));

	}

}
