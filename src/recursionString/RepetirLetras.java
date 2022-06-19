package recursionString;

public class RepetirLetras {
	
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
	
	public static String repetirLetras(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(esVocal(s.charAt(0))&&esVocal(s.charAt(1))) {
			return""+s.charAt(0)+s.charAt(0)+repetirLetras(resto(s));
		}
		if(!esVocal(s.charAt(0))&& !esVocal(s.charAt(1))) {
			return""+s.charAt(0)+s.charAt(0)+s.charAt(0)+repetirLetras(resto(s));
		}
		return ""+s.charAt(0)+repetirLetras(resto(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repetirLetras("stvedraa"));

	}

}
