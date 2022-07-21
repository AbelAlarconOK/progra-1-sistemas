package objetos;

import java.awt.*;

public class MedidaDeDiagonal {
	
	
		public static double distanciaEntrePoints(Point p1, Point p2) {
			double distancia=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p2.y));
			return distancia;
		}
	
	public static double medidaDeDiagonaL(Rectangle r) {
		Point p1= new Point(r.x,r.y);
		Point p2= new Point(r.x+r.width,r.y+r.height);
		double diagonal = distanciaEntrePoints(p1,p2);
		return diagonal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Rec = new Rectangle(10,20,100,200);
		System.out.println(medidaDeDiagonaL(Rec));
	}

}
