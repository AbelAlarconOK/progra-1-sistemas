package game;

public class Carta {
	private int palo;
	private int numero;

	// IREP
	// 1 <= palo <= 4 && (1 <= numero <= 7 || 10<=numero<=12)

	public Carta(int palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	public String toString() {
		String[] palos = { "espada", "basto", "oro", "copa" };
		return numero + " de " + palos[this.palo - 1];
	}
}
