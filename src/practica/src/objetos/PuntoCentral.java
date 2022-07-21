package objetos;

import java.awt.*;

public class PuntoCentral {

	static Point calcularCentro(Rectangle caja) {
		int x = caja.x+caja.width/2;
		int y = caja.y+caja.height/2;
		Point punto = new Point (x,y);
		return punto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec= new Rectangle(5,10,100,200);
		System.out.println(rec);
		rec.grow(5, 10);//CRECER.
		System.out.println(rec);
		System.out.println(calcularCentro(rec));
		
	}

}
