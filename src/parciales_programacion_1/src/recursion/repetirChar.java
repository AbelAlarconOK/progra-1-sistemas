package recursion;

public class repetirChar {
	
/*Escribir el metodo recursivo public static String repetirChar(String s, char c, int n), que devuelve la cadena con
los mismos caracteres de s, donde el caracter c figura repetido n veces.
Por ejemplo:
repetirChar(”ameno”,’a’,3) debe devolver ”aaameno”.
repetirChar(”caerse”,’e’,4) debe devolver ”caeeeerseeee”.
repetirChar(”fino”,’u’,2) debe devolver ”fino”.*/

	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static String repetirLetra(String s, char c, int n) {
		if(s.length()==0) {
			return "";
		}
		String repetidos="";
		if(s.charAt(0)==c && n>0) {
			for(int i=0;i<n;i++) {
				repetidos+=s.charAt(0);
			}
		return ""+s.charAt(0)+repetidos+repetirLetra(resto(s),c,n); 
		}
		return ""+s.charAt(0)+repetirLetra(resto(s),c,n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra ="caerseme";
		char c = 'e';
		int n =2;
		System.out.println(repetirLetra(palabra,c,n));
	}

}
