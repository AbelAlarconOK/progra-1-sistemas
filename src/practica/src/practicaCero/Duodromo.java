package practicaCero;

import java.util.Scanner;

public class Duodromo {
	
	
	public static  boolean esDuodromo(String a) {
		String palabra_uno = "";//ssaannaa
		String palabra_dos = "";
		for(int i = 1; i<a.length();i=i+2) {
			palabra_uno = palabra_uno+a.charAt(i);
		}
		for (int cont = 0;cont<a.length();cont=cont+2) {
			palabra_dos = palabra_dos+a.charAt(cont);
		}
		if(palabra_dos.compareTo(palabra_uno)==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer una función que tome un string y devuelva true si es duódromo, y false en caso contrario.
		 *Un string es duódromo si está compuesto solamente por letras duplicadas contiguas.*/
		Scanner scan= new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String palabra = scan.next();
		System.out.println(esDuodromo(palabra));
		scan.close();
	}

}


