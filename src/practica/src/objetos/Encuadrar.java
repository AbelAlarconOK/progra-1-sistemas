package objetos;

import java.awt.*;

public class Encuadrar {
	
	public static Rectangle encuadrar(Rectangle r, Rectangle s) {
		int xmax=Math.max(r.x+r.width, s.x+s.width);
		int xmin=Math.min(r.x, s.x);
		int ymax=Math.max(r.y+r.height, s.y+s.height);
		int ymin=Math.min(r.y, s.y);
		int rw=xmax-xmin;
		int rh=ymax-ymin;
		Rectangle rec = new Rectangle(xmin,ymin,rw,rh);
		return rec;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle(10,20,100,200);
		Rectangle rec2 = new Rectangle(20,40,200,400);
		System.out.println(encuadrar(rec,rec2));
	}

}
