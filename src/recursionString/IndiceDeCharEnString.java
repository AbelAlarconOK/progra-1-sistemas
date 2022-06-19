package recursionString;

public class IndiceDeCharEnString {
	
	public static String resto(String s) {
		String nuevo="";
		for(int i=1;i<s.length();i++) {
			nuevo=nuevo+s.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean estaEn(String s, char a) {
		if(s.length()==0) {
			return false;
		}
		if(s.charAt(0)==a) {
			return true;
		}else {
			return estaEn(resto(s),a);
		}
	}
	
	public static int indiceDe(String s ,char a) {
		if(s.length()==0 || !estaEn(s,a)) {
			return -1;
		}
		if(s.charAt(0)==a) {
			return 0;
		}else {
			return 1+indiceDe(resto(s),a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra="mesa";
		char letra='a';
		System.out.println(indiceDe(palabra,letra));

	}

}
