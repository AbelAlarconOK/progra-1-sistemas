package recursionString;

public class RestoConAuxiliar {
	
	
	public static String restoAuxiliar(String a, int pos) {
		if(pos>=a.length()) {
			return "";
		}
		return a.charAt(pos)+restoAuxiliar(a,pos+1);
	}

	public static String resto(String s) {
		return restoAuxiliar(s,1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(restoAuxiliar("mesa",2));
		System.out.println(resto("monumental"));
	}

}
