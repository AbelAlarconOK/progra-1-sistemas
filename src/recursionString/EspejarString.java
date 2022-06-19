package recursionString;

public class EspejarString {
	

	public static String resto(String s) {
		String nuevo="";
		for(int i =1;i<s.length();i++) {
			nuevo=nuevo+s.charAt(i);
		}return nuevo;
	}
	
	public static String espejarPalabra(String s) {
		if(s.isEmpty()) {
			return s;
		}
		return espejarPalabra(resto(s))+s.charAt(0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(espejarPalabra("morza"));

	}

}
