package practicaCero;

import java.util.Scanner;

public class CantidadAparece {

	public static int cantidadApariciones(String pala, char let) {
		int cont = 0;
		char d = (""+let).toLowerCase().charAt(0);
		pala = pala.toLowerCase();
		
		for (int i=0;i<pala.length();i++) {
			if (d==pala.charAt(i)) {
				cont++;
			}
		}return cont;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		System.out.print("Ingrese una letra: ");
		char letra = scan.next().charAt(0);
		scan.close();
		System.out.println("La letra "+letra+" aparece: " );
		System.out.println(cantidadApariciones(palabra,letra));
	}

}
