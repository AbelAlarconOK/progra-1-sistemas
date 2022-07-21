
package recursion;

public class RemplazarVovales {

	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public boolean esVocal(char c) {
		return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
