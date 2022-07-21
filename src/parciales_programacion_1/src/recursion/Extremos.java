package recursion;

public class Extremos {

/*Escribir una funcion recursiva String extremos(String s, int n, int m) que retorna el string formado por
los primeros n caracteres y los ultimos m caracteres de s. Se asume que la suma de n + m es menor a
la longitud de la cadena s. Por ejemplo:
extremos(”solemnidad”, 4, 3) debe devolver ”soledad”.
extremos(”solitario”, 3, 1) debe devolver ”solo”.
extremos(”soledad”, 0, 4) debe devolver ”edad”.
extremos(”soledad”, 3, 0) debe devolver ”sol”.
extremos(”palabra”, 0, 0) debe devolver ””.
*/
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	
	public static String extremos(String s, int n, int m) {
		if(s.length()==0 || (n==0 && m==0)) {
			return "";
		}
		if(n>=1) {
			return "" +s.charAt(0)+ extremos(resto(s),n-1,m);
		}
		if(s.length()>m) {
			return ""+extremos(resto(s),n,m);
		}else {
			return ""+s.charAt(0)+extremos(resto(s),n,m-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra="soledad";
		int n=0;		
		int m=0;		
		System.out.println(extremos(palabra,n,m));
	}

}
