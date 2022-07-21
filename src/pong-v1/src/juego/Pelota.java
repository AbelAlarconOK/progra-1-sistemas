package juego;

import java.awt.Color;

import entorno.Entorno;

public class Pelota {
	private double x;
	private double y;
	private double diametro;
	private double angulo;
	private Color color;
	private double velocidad;

	public Pelota(double x, double y, double angulo) {
		this.x = x;
		this.y = y;
		this.angulo = angulo;
		this.color = Color.CYAN;
		this.diametro = 50;
		this.velocidad = 1;
	}

	public void dibujar(Entorno e) {
		e.dibujarCirculo(this.x, this.y, this.diametro, this.color);
	}

	public void mover() {
		this.x = this.x + Math.cos(this.angulo) * this.velocidad;
		this.y = this.y + Math.sin(this.angulo) * this.velocidad;
	}

	public void aumentarVelocidad(double v) {
		this.velocidad += v;
	}

	public boolean chocaConEntorno(Entorno e) {
		return (x - diametro / 2 <= 0 || x + diametro / 2 >= e.ancho() || 
				y - diametro / 2 <= 0);
	}

	public void rebotar(Entorno e) {
		if (y - diametro / 2 <= 0) {
			this.angulo = - this.angulo;
		}
		if(x - diametro / 2 <= 0 || x + diametro / 2 >= e.ancho()) {
		    this.angulo = Math.PI - this.angulo ;
		}
	}

}
