package practicaCero;

import java.util.Scanner;

//METODOS CON RESULTADO E ITERACION.

public class SumatoriaPares {
	
	//Ej 11.
	static void sumaPares(int n) {
		int i = 1;
		int suma = 0;
		
		while (i<n) {
			i=i+1;
			if(i%2==0) {
				suma = suma+i;
				System.out.println(suma);
			}
		}
	}
	
	
	
	//Ej 10.
	static void bucle(int n) {
		int i =1;
		int suma= 1;
		
		/*for (i=1; i<=n; i=i+1 ) {
			suma = suma+1;
		}*/
		
		while (i<n) {
			i= i+1;
			suma = suma+i;
		}	
		System.out.println(suma);

	}
	
	public static void main(String[] args) {
		/*Ej 10 Escribir un metodo static int sumatoria(int n) que devuelve la sumatoria de los numeros
		desde 1 hasta n.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int n = scan.nextInt();
		bucle(n);
		/*Ej 11 Escribir un metodo static int sumatoriaPares(int n) que devuelve la sumatoria de los numeros
		pares desde 2 hasta n.*/
		System.out.println("ingrese otro numero");
		int a = scan.nextInt();
		sumaPares(a);
		scan.close(); 
	}
	
}
