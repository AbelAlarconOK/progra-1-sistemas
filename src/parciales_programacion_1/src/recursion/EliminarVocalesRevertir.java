package recursion;

public class EliminarVocalesRevertir {
	
	
/*	Escribir una funcion recursiva String eliminarVocalesYRevertir(String s) que toma un String s y devuelve
	una nueva cadena que resulta de eliminar de s todas las vocales y luego invertir sus caracteres. Por
	ejemplo:
	eliminarVocalesYRevertir(’’toro’’) debe devolver ’’rt’’.
	eliminarVocalesYRevertir(’’risa.’’) debe devolver ’’sr.’’.
	eliminarVocalesYRevertir(’’mapa’’) debe devolver ’’pm’’.
	eliminarVocalesYRevertir(’’fadap’’) debe devolver ’’pdf’’.
	eliminarVocalesYRevertir(’’uia’’) debe devolver ’’’’.
*/
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static boolean esVocal( char n) {
		return (n=='a' || n=='e' || n=='i' || n=='o' || n=='u');
	}
	

	public static String eliminarVocalesYRevertir(String s) {
		if(s.length()==0) {
			return "";
		}
		if(!esVocal(s.charAt(0))) {
			return ""+eliminarVocalesYRevertir(resto(s))+s.charAt(0);
		}
		return eliminarVocalesYRevertir(resto(s));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra ="uia";
		System.out.println(eliminarVocalesYRevertir(palabra));
	}

}
