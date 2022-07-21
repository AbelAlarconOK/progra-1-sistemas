package resolucion;

public class CirculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dibujador dib = new Dibujador();
		Circulo circ1 = new Circulo(100, 200, 80); // Ver constructor m´as abajo
		Circulo circ2 = new Circulo(500, 400, 120); // Ver constructor m´as abajo
		dib.dibujar(circ1);
		circ1.imprimir();
		circ1.desplazarCirculo(200, 5);
		dib.dibujar(circ1);
		dib.dibujar(circ2);
		Circulo.dibujarCirculo(dib, 350, 300, 200);

	}

}
