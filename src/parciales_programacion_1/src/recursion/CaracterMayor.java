package recursion;

public class CaracterMayor {

	/*
	 * Escribir una funcion recursiva public static char caracterMayor(String s) que
	 * devuelve el caracter perteneciente a s que es mayor en el orden alfabetico.
	 * Se asume que el String s tiene al menos un caracter. Por ejemplo:
	 * caracterMayor(”a”) debe devolver el caracter ’a’.
	 * caracterMayor(”abcdefghi”)debe devolver el caracter ’i’. 
	 * caracterMayor(”capicua”) debe devolver el caracter ’u’.
	 * caracterMayor(”universitario”) debe devolver el caracter ’v’.
	 * caracterMayor(”cazador”) debe devolver el caracter ’z’.
	 */

	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	 public static char caracterMayor(String s) {
		 if(s.length()==1) {
			 return s.charAt(0);
		 }
		 if(s.charAt(0)>s.charAt(1)) {
			 return caracterMayor(s.charAt(0)+resto(resto(s)));
		 }
		 return caracterMayor(resto(s));
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="abcdefghi";
		System.out.println(caracterMayor(palabra));

	}

}
