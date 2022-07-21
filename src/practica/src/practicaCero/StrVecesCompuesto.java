package practicaCero;

import java.util.Scanner;

public class StrVecesCompuesto {
	
	
	public static int vecesAparece(String a, char b) {
		int cont =0;
		char d = (""+b).toLowerCase().charAt(0);
		a = a.toLowerCase();
		for(int i=0; i<a.length();i++) {
			if (a.charAt(i)==d) {
				cont=cont+1;
			} 
		}return cont;
	}
	public static boolean compuesto(String e, char f) {
		int cant=0;
		char t =(""+f).toLowerCase().charAt(0);
		for(int j = 0; j<e.length(); j++) {
			if(e.charAt(j)==t) {
				cant++;
			}if(cant==e.length()) {
				return true;
			}
		}return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hacer una función que tome un string y cuente la cantidad de veces que aparece la letra 'e'
		 *ya sea mayúscula o minúscula. Probarla en una función main() de pruebas en un archivo aparte.*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		System.out.println("Ingrese una letra: ");
		char letra = scan.next().charAt(0);
		scan.close();
		/*Hacer una función que devuelva true si el string está compuesto solamente por letras 'e',
		* y false en caso contrario.*/
		System.out.println(vecesAparece(palabra,letra));
		System.out.println(compuesto(palabra,letra));
	}

}
