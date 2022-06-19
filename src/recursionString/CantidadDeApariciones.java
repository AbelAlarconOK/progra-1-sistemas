package recursionString;

public class CantidadDeApariciones {
	
	public static String resto(String s) {
		String resto ="";
		for (int i=1;i<s.length();i++) {
			resto=resto+s.charAt(i);
		}
		return resto;
	}
	
	public static int cantidadDeApariciones(String s, char b) {
		if(s.equals("")){
			return 0;
		}
		if(s.charAt(0)==b) {
			return 1+cantidadDeApariciones(resto(s),b);
		}else {
			return cantidadDeApariciones(resto(s),b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pal="banana";
		char letra='a';
		System.out.println(resto(pal));
		System.out.println(cantidadDeApariciones(pal,letra));

	}

}
