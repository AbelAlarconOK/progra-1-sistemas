package objetos;

import java.awt.*;

public class DistanciaEntrePoints {

	public static double distanciaEntrePoints(Point p1, Point p2) {
		double distancia=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
		return distancia;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point uno = new Point(2,4);
		Point dos = new Point(4,6);
		System.out.println(distanciaEntrePoints(uno,dos));
		
		//OTRA FORMA.
		System.out.println(uno.distance(dos));

	}

}
