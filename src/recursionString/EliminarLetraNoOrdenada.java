package recursionString;

public class EliminarLetraNoOrdenada {
	
	public static String resto(String s) {
		String nuevo="";
		for(int i=1;i<s.length();i++) {
			nuevo=nuevo+s.charAt(i);
		}
		return nuevo;
	}
	
	public static String eliminarNoOrdenada(String s) {
		if(s.length()==1) {
			return s;
		}
		if(s.charAt(0)<s.charAt(1)) {
			return ""+s.charAt(0)+eliminarNoOrdenada(resto(s));
		}
		return eliminarNoOrdenada(resto(s));
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="atbdcdz";
		System.out.println(eliminarNoOrdenada(a));
	}

}
