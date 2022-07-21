package resolucion;

public class Circulo {
	double radio;
	Punto centro;
	//IREP
	//RADIO>0
	
	public Circulo(double centro_x, double centro_y, double radio){
		this.radio=radio;
		this.centro= new Punto(centro_x,centro_y);
	}
	
	
	//METODO DE INSTANCIA.
	public void imprimir() {
		System.out.println("Centro = "+this.centro.x+","+this.centro.y);
		System.out.println("Radio = "+this.radio);
	}
	
	public double perimetroCirculo() {
		return 2*Math.PI*this.radio;
	}
	
	public double superfiieCirculo() {
		return Math.PI*(this.radio*this.radio);
	}
	
	public void desplazarCirculo(double des_x, double des_y) {
		this.centro.desplazar(des_x, des_y);
	}
	

	
	//METODO DE CLASE.
	
	public static double distancia(Circulo c1,Circulo c2) {
		double distCentro=Punto.distanciaPoint(c1.centro, c2.centro);
		double sumaRadio=c1.radio+c2.radio;
		if(distCentro>sumaRadio) {
			return distCentro-sumaRadio;
		}else {
			return 0;
		}
	}
	
	public static boolean seTocan(Circulo c1, Circulo c2) {
		return distancia(c1,c2)==0;
	}
	
	public static void dibujarCirculo(Dibujador dib, int x, int y, int r) {
		//CASO BASE.
		if(r<10) {
			return;
		}else {
			Circulo c= new Circulo(x,y,r);
			dib.dibujar(c);
			dibujarCirculo(dib,x+r,y,r/2);
			dibujarCirculo(dib,x-r,y,r/2);
			dibujarCirculo(dib,x,y+r,r/2);
			dibujarCirculo(dib,x,y-r,r/2);

		}
	}
	
}
