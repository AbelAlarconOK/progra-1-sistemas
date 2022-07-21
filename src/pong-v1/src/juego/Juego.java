package juego;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {

	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
//	private int n;
	private Pelota pelota;

	public Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Pong - Grupo N - Apellido1 - Apellido2 -Apellido3 - V0.01", 800, 600);
//		this.n = 0;
		this.pelota = new Pelota(100, 100, -Math.PI/8);

		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar el
	 * estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	public void tick() {
		// Procesamiento de un instante de tiempo
		// ...

//		entorno.dibujarCirculo(50, 50, 50, Color.CYAN);
		pelota.dibujar(entorno);
		pelota.mover();
		
		if(entorno.sePresiono('s')) {
			pelota.aumentarVelocidad(0.2);
		}
		
		if(pelota.chocaConEntorno(entorno)) {
			pelota.rebotar(entorno);
		}

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Juego juego = new Juego();
	}

}
