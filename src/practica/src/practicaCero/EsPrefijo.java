package practicaCero;

import java.util.Scanner;

public class EsPrefijo {
	
	public static boolean esPrefijo(String prefijo, String a, int posicion) {
		if(prefijo.length()>a.length()) {
			return false;
		}
		else {
			for(int i=0;i<prefijo.length();i++) {
				if(prefijo.charAt(i)!= a.charAt(i+posicion)) {	
					return false;
				}
			}
			return true;
		}
	
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese una palabra");
		String palabra = scan.nextLine();
		System.out.println("Ingrese un prefijo");
		String prefijo = scan.nextLine();
		System.out.println("Ingrese posicion");
		int pos = scan.nextInt();
		scan.close();
		System.out.println(esPrefijo(prefijo,palabra,pos));
		
	}
}
