package resolucion;

public class Punto {
	double x;
	double y;
	
	Punto(){
		this.x=0;
		this.y=0;
	}
	
	Punto(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	//METODOS DE INSTANCIA
	
	public void imprimir() {
		System.out.println("La cordednada del punto es: "+"x= "+ this.x +" y= " +this.y);
	} 
	
	public void desplazar(double x, double y) {
		this.x=this.x+x;
		this.y=this.y+y;
	}
	
	//METODO DE CLASE
	
	public static double distanciaPoint(Punto p1, Punto p2) {
		double distancia=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
		return distancia;
	}
}


