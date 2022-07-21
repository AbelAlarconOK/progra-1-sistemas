package game;

public class Juego {

	public static void main(String[] args) {
		// Soy un juego de cartas, completame!;
		
//		Carta c = new Carta(2,7);
//		System.out.println(c);
		
		Mazo m = new Mazo(40);
		m.crearCartasMazoDe40();
		
		Mano jugador = new Mano();
		
		m.mezclar();
//		m.mostrar();
		
		Carta c = m.repartir();
		jugador.recibirCarta(c);
		jugador.recibirCarta(m.repartir());
		jugador.mostrar();
		
		//Para el juego tambien necesitan una carta en la mesa:
		//Carta mesa = m.repartir();

	}

}
