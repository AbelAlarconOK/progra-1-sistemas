package game;

import java.util.Random;

public class Mazo {
	private Carta[] cartas;
	private int repartidas;

	// IREP
	// para cartas españolas
	// cartas.lenght != 40
	// cartas[i] == null si i < repartidas

	public Mazo(int largo) {
		this.cartas = new Carta[largo];
	}

	public void crearCartasMazoDe40() {
		int j = 0;
		for (int p = 1; p <= 4; p++) {
			for (int i = 1; i <= 7; i++) {
				cartas[j++] = new Carta(p, i);
			}
			for (int i = 10; i <= 12; i++) {
				cartas[j++] = new Carta(p, i);
			}
		}
	}

	//cartas ---> [null,null,carta1,carta3]
	public void mostrar() {
		if (repartidas == cartas.length) {
			System.out.println("No hay más cartas en el mazo!");
		}
		for (int i = repartidas; i < this.cartas.length; i++) {
			System.out.println(this.cartas[i]);
		}
	}

	public void mezclar() {
		Random r = new Random();
		int posI, posJ;
		Carta aux;
		for (int k = 0; k < 4000; k++) {
			posI = this.repartidas + r.nextInt(this.cartas.length - this.repartidas);
			posJ = this.repartidas + r.nextInt(this.cartas.length - this.repartidas);
			aux = this.cartas[posI];
			this.cartas[posI] = this.cartas[posJ];
			this.cartas[posJ] = aux;
		}
	}
	
	//cartas ---> [null, carta1, carta3]
	//repartidas=1
	//cartas ---> [null, null, carta3]
	//repartidas=2
	public Carta repartir() {
		Carta c = this.cartas[this.repartidas];
		this.cartas[this.repartidas] = null;
		this.repartidas++;
		return c;
	}

}
