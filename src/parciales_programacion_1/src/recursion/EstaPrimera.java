package recursion;

public class EstaPrimera {

/*
Escribir una funcion recursiva String estaPrimera(String s1, String s2) que toma dos String s1 y s2 y devuelve el
String que esta primero en el diccionario. Por ejemplo:
alternados(’’piedra’’,’’cantor’’) debe devolver ’’cantor’’.
alternados(’’’’,’’perro’’) debe devolver ’’’’.
alternados(’’hielo’’,’’holanda’’) debe devolver ’’hielo’’.
alternados(’’candelabro’’,’’canario’’) debe devolver ’’canario’’.
alternados(’’materia’’,’’’’) debe devolver ’’’’.
*/	
	
	public static boolean esVocal( char n) {
		return (n=='a' || n=='e' || n=='i' || n=='o' || n=='u');
	}
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	
	public static String estaPrimera(String s1, String s2) {
		if(s1.length()==0||s2.length()==0) {
			return "";
		}
		if(s1.charAt(0)<s2.charAt(0)) {
			return "" +s1;
		}
		if(s2.charAt(0)<s1.charAt(0)) {
			return "" +s2;
		}
		if(s1.charAt(0)==s2.charAt(0)) {
			return ""+s1.charAt(0)+estaPrimera(resto(s1),resto(s2));
		}
		return estaPrimera(resto(s1),resto(s2));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra_uno="materia";
		String palabra_dos="materio";
		System.out.println(estaPrimera(palabra_uno, palabra_dos));


	}

}
