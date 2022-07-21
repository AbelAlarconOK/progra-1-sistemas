package objetos;

import java.awt.*;

public class PointsDentro {

	public static boolean estaAdentro(Point p, Rectangle r) {
		if((p.x>=r.x && p.x<=r.width)&&(p.y>=r.y && p.y<=r.height)){
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(10,20,100,200);
		Point punto = new Point(10,21);
		System.out.println(estaAdentro(punto,rec));
	}

}
