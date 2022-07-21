package practicaCero;

public class DobleCapicua {
	
	public static boolean isCap(String s) {
		String reverso="";
		for(int i=s.length()-1;i>=0;i--) {
			reverso = reverso+s.charAt(i); 
		}
		return s.equals(reverso);
	}
	
	public static String first(String s, int pos) {
		return s.substring(0,pos);
	}
	
	public static String sec(String s , int pos) {
		return s.substring(pos,s.length());
	}
	
	public static boolean esDobleCapicua(String s) {
		for(int i=0; i <s.length();i++) {
			String a = first(s,i);
			String b = sec(s,i);
			if(isCap(a)&&isCap(b)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="casa";
		System.out.println(isCap(palabra));
		System.out.println(first(palabra,2));
		System.out.println(sec(palabra,1));
		System.out.println(esDobleCapicua("neuquenoso"));
	}

}
