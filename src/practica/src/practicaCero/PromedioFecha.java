package practicaCero;

import java.util.Scanner;

public class PromedioFecha {
	
	//Ej 8.
	static void promedio(double a, double b) {

		double suma = (a+b);
		double resultado = suma/2;
		
		if (resultado >=7) {
			System.out.println("Felicidades aprobado, :" + resultado);
		}else {
			System.out.println("Recuperar, :" + resultado);
		}
	}
	
	//Ej 9.
	static void imprimirFecha(int dia, int mes, int anio) {
		
		String day = dia+"";
		String month = mes+"";
		String ano = anio+"";
		
		System.out.println(day+" de "+month+" de "+ ano);
	}
	

	public static void main (String[] args) {
		
		/*Ejercicio 8 pedir al usuario 2 notas y si es > 7 mostrar Aprobado en caso contrario Recuperar*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su primer nota: ");
		float n_1 = scan.nextFloat();
		System.out.println("Ingrese su segunda nota: ");
		float n_2 = scan.nextFloat();
		promedio(n_1,n_2);
		
		
		/*Ejercicio 9  Escribir un metodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
		fecha pasada como par´ametro en formato del estilo “5 de Julio de 2030”.*/
		System.out.println("ingrese el dia: ");
		int a = scan.nextInt();
		System.out.println("ingrese el mes: ");
		int b = scan.nextInt();
		System.out.println("ingrese el año: ");
		int c = scan.nextInt();
		
		imprimirFecha(a, b, c);
		
		scan.close();
		
	}
}
