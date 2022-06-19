package recursionString;

public class StringDesde {
	
	public static String resto(String s, int desde) {
		String resto = "";
		for (int i = desde; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	public static String substring(String s,int desde,int hasta) {
		if(desde==hasta) {
			return""+ s.charAt(desde);
		}
		return""+s.charAt(desde)+ substring(s,desde+1,hasta);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="monumental";
		int b=1;
		int c=5;
		System.out.println(substring(a,b,c));
	}

}
