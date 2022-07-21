package tateti;

import java.util.Scanner;

import tateti.TaTeTi;

public class juego{
	public static void main(String[] args) {
TaTeTi juego = new TaTeTi();
		
while(!juego.terminado()){
		juego.mostrar();
		
		System.out.println("proximo turno ");
		
		Scanner a = new Scanner(System.in);
		
		Scanner b = new Scanner(System.in);
		try{
		System.out.println("indique fila del 1 al 3");
		int fila = a.nextInt();
		System.out.println("indique columna del  1 al 3");
		int columna = b.nextInt();
		
		
		juego.jugar(fila,columna);
		}catch (RuntimeException ex){
			System.out.println(ex.getMessage());
		}

	}
		juego.mostrar();
		char usuario1 = 'x';
		char usuario2 = 'o';
		if (juego.ganador()==usuario1){
			System.out.println("Gano el jugador "+ usuario1);
			return;
		}if (juego.ganador()==usuario2){
			System.out.println("Gano el jugador "+ usuario2);
			return;
		}else{
			System.out.println("Empate");
		}
	}

}
