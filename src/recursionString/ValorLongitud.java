package recursionString;

public class ValorLongitud {
	
	public static String resto(String s) {
		String resto ="";
		for (int i=1;i<s.length();i++) {
			resto=resto+s.charAt(i);
		}
		return resto;
	}
	
	public static int valorLongitud(String s) {
		if(s.length()==0) {
			return 0;
		}
		return 1+valorLongitud(resto(s));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal="banana";
		System.out.println(valorLongitud(pal));

	}

}
