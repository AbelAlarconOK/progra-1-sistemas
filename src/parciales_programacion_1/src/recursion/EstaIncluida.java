package recursion;

public class EstaIncluida {
	
	/*Escribir una funcion recursiva boolean estaIncluida(String s1, String s2) que toma dos String s1 y s2 y devuelve
	true si los caracteres de la cadena s1 estan presentes en la cadena s2, respetando el orden de s1 y considerando
	las repeticiones. Por ejemplo:
	estaIncluida(’’ala’’, ’’calidad’’) debe devolver true.
	estaIncluida(’’alla’’, ’’calidad’’) debe devolver false.
	estaIncluida(’’alla’’, ’’llave’’) debe devolver false.
	estaIncluida(”cajon’’, ”callejones’’) debe devolver true.
	estaIncluida(’’’’, ’’palabra’’) debe devolver true.
	estaIncluida(’’ala’’, ’’almidon’’) debe devolver false.
	*/
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	
	public static boolean estaIncluida(String s1, String s2) {
		if(s1.length()==0) {
			return true;
		}if(s2.length()==0) {
			return false;
		}
		if(s1.charAt(0)==s2.charAt(0)) {
			return estaIncluida(resto(s1),resto(s2));
		}
		if(s1.charAt(0)!=s2.charAt(0)) {
			return estaIncluida(s1,resto(s2));
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		String palabra_uno= "ala";
		String palabra_dos= "calidad";
		System.out.println(estaIncluida(palabra_uno,palabra_dos));
	}

}
