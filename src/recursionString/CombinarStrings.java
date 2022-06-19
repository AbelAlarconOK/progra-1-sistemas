package recursionString;

public class CombinarStrings {
	
	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	public static String combinar(String a , String b) {
		if(a.length()==0 || b.length()==0) {
			return a+b;
		}
		if(a.charAt(0)<b.charAt(0)) {
			return ""+a.charAt(0)+combinar(resto(a),resto(b));
		}else {
			return ""+b.charAt(0)+combinar(resto(a),resto(b));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="casas";
		String b ="amba";
		System.out.println(combinar(a,b));

	}

}
