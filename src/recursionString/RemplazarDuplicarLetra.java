package recursionString;

public class RemplazarDuplicarLetra {
	
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
	
	public static String laMar(String s) {//REMPLAZAR VOCALES POR 'A' Y DUPLICAR CONSONANTES.
		if(s.equals("")) {
			return s;
		}
		if(esVocal(s.charAt(0))) {
			return "A"+laMar(resto(s));
		}else {
			return ""+s.charAt(0)+s.charAt(0)+laMar(resto(s));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(laMar("carro"));


	}

}
