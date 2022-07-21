package practicaCero;

import java.util.Scanner;

public class PedirSaludar {
	// Ej 2.
	static String pedirNombre() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("hola ingrese su nombre");
		teclado.close();
		return teclado.nextLine();
	}

	// Ej 2.
	static void saludar(String nombre) {
		System.out.println("hola, " + nombre);
	}

	// Ej 3.
	static int sumar(int a, int b) {
		return a + b;
	}

	// Ej5.
	static int promedio(int a, int b, int c) {
		int suma = a + b + c;
		int promedio = suma / 3;
		return promedio;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ejercicio 2 hacer un programa que pida al usuario su nombre y lo salude */
		String nombre = pedirNombre();
		saludar(nombre);

		/* Ejercicio 3 pedir al usuario dos numeros y sumarlos */
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		int primer = scan.nextInt();
		System.out.println("ingrese el segundo numero");
		int segundo = scan.nextInt();
		System.out.println("\n la suma es: " + sumar(primer, segundo));

		/* Ejercicio 5 pedir tres notas y devolver el promedio */

		System.out.println("ingrese primer nota: ");
		System.out.println("Ingrese segunda nota: ");
		System.out.println("Ingrese tercer nota: ");
		scan.close();

		int p_nota = scan.nextInt();
		int s_nota = scan.nextInt();
		int t_nota = scan.nextInt();

		System.out.println("Su promedio es: " + promedio(p_nota, s_nota, t_nota));

	}

}
