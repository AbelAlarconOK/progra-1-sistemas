package practicaCero;

import java.util.Scanner;

public class ImpriReversa {
	
	public static String imprimirReversa(String pala) {
		String nueva_pala = "";
		for (int i=pala.length()-1;i>=0;i--) {
			nueva_pala = nueva_pala+pala.charAt(i);
		}return nueva_pala;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ingrese una palabra: ");
		String palabra = scan.nextLine();
		scan.close();
		System.out.println(imprimirReversa(palabra));
	}

}