package juegoAhorcado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		String palabra = "perro";
//		System.out.println(palabra);

		Ahorcado ah = new Ahorcado(palabra);
		Scanner scan = new Scanner(System.in);

		while (!ah.terminado()) {
			ah.mostrar();
			//System.out.println("Ingrese una letra: ");
			//String usuario = scan.nextLine();
			//char letra = usuario.charAt(0);
			System.out.println("Ingrese una palabra: ");
			String p = scan.next();
			scan.close();
		
			//ah.arriesgarLetra(letra);
			ah.arriesgarPalabra(p);
		}
		
		if(ah.ganado()) {
			System.out.println("GANASTE!!!");
			ah.mostrar();
		} else {
			System.out.println("AHORCADO!!!");
			System.out.print("La palabra era: ");
			ah.mostrarPalabra();
		}

	

	}

	/**
	 * Devuelve una palabra del diccionario elegida alazar
	 */
	private static String palabraRandom() {
		String ret = null;
		try {
			Scanner arch = new Scanner(new File("palabras.txt"));
			int k = (int) (Math.random() * 190);

			while (k > 0) {
				ret = arch.next();
				k--;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String acentos = "αινσϊ";
		String vocales = "aeiou";
		for (int i = 0; i < acentos.length(); i++)
			ret = ret.replace(acentos.charAt(i), vocales.charAt(i));
		return ret;
	}

}
