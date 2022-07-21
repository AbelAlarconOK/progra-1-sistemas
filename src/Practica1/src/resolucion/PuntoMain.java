package resolucion;


public class PuntoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1= new Punto(2,4);
		Punto p2= new Punto(4,6);
		//p1.imprimir();
		//p1.desplazar(4, 8);
		//p1.imprimir();
		System.out.println(Punto.distanciaPoint(p1, p2));
	}

}
