package game;

public class Mano {
	private Carta[] cartas;
	private int cantidad;

	// IREP
	// cantas.length==40
	// cantidad <= 40

	public Mano() {
		this.cartas = new Carta[40];
		this.cantidad = 0;
	}
	
	public void mostrar() {
		for (int i = 0; i < this.cantidad; i++) {
			if (cartas[i] != null) {
				System.out.println(this.cartas[i]);
			}
		}
	}
	
	public void recibirCarta(Carta c) {
		cartas[cantidad] = c;
		cantidad++;
	}
	

}
