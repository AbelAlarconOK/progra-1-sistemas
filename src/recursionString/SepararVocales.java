package recursionString;

public class SepararVocales {
	
	public static String resto(String s) {
		String nuevo="";
		for(int i=1;i<s.length();i++) {
			nuevo=nuevo+s.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean esVocal(char x) {
		String vocales = "aeiou";
		if(vocales.indexOf(x)==-1) {
			return false;
		}
		return true;
	}
	
	
	public static String separarVocales(String s) {
		if(s.equals("")) {
			return s;
		}
		String nueva="";
		if(esVocal(s.charAt(0))) {
			nueva=nueva+s.charAt(0);
		}else {
			return ""+s.charAt(0)+separarVocales(resto(s));
		}
		return ""+separarVocales(resto(s))+nueva;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hola";
		System.out.println(separarVocales("heolat"));

	}

}
