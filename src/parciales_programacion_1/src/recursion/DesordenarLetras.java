package recursion;

public class DesordenarLetras {

/*Escribir una funcion recursiva String desordenarLetras(String s1) que toma un String s1 y retorna una nueva
cadena en la cual las consonantes de s1 aparecen al principio y las vocales al final. El orden entre las vocales
y entre las consonantes no importa, pero se debe cumplir que todas las consonantes esten al principio y todas
las vocales al final.
Por ejemplo:

desordenarLetras(”murcielago”) puede devolver ”mrclgoaeiu”.
desordenarLetras(”manzana”) puede devolver ”mnznaaa”.
desordenarLetras(”llamado”) puede devolver "llmdoa"
desordenarLetras(”el”) debe devolver ”le”*/	
	
	
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
	
	public static String desordenarLetras(String s1) {
		if(s1.equals("")) {
			return "";
		}
		if(!esVocal(s1.charAt(0))){
			return "" +s1.charAt(0)+ desordenarLetras(resto(s1));
		}
			return "" + desordenarLetras(resto(s1))+ s1.charAt(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="el";
		System.out.println(desordenarLetras(palabra));

	}

}
