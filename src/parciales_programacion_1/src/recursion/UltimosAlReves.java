package recursion;

public class UltimosAlReves {
	
	
/*Escribir una funcion recursiva public static String ultimosAlReves(String s, int n) que devuelve el
String formado por los ultimos n caracteres de s invertidos.
Por ejemplo:
ultimosAlReves(’’recital’’, 3) debe devolver ’’lat’’.
ultimosAlReves(’’recital’’, 5) debe devolver ’’latic’’.
ultimosAlReves(’’recital’’, 7) debe devolver ’’laticer’’.
ultimosAlReves(’’’’, 3) debe devolver ’’’’.
ultimosAlReves(’’hola’’, 1) debe devolver ’’a’’.
ultimosAlReves(’’hola’’, 2) debe devolver ’’al’’
*/
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}

	public static String ultimosAlReves(String s, int n) {
		if(s.length()==0 || n ==0 ) {
			return "";
		}
		if(s.length()>n) {
			return ultimosAlReves(resto(s),n);
		}
		return "" + ultimosAlReves(resto(s),n-1)+s.charAt(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="hola";
		int n=2;
		System.out.println(ultimosAlReves(palabra,n));
	}

}
