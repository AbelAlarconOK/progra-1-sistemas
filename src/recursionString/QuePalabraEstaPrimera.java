package recursionString;

public class QuePalabraEstaPrimera {
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static String estaPrimera(String s , String b) {
		if(s==b) {
			return s;
		}
		if(s.charAt(0)<b.charAt(0)) {
			return s;
		}
		
		if(s.charAt(0)>b.charAt(0)) {
			return b;
		}
		return estaPrimera(resto(s),resto(b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(estaPrimera("piedra","cantor"));
	}

}
