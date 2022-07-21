package resolucion;

public class FraccionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Fraccion f1= new Fraccion(1,2 );
		Fraccion f2= new Fraccion(4,6);
		//frac.imprimirFraccion();
		//frac.imprimirFraccion();
		//frac.invertirSigno();
		//frac.imprimirFraccion();
		//frac.invertirFraccion();
		//frac.imprimirFraccion();
		//System.out.println(frac.aDoulbe());
		f1.imprimirFraccion();
		f1.reducir();
		f1.imprimirFraccion();
		Fraccion f3=Fraccion.fraccionProducto(f1, f2);
		f3.imprimirFraccion();
		Fraccion f4=Fraccion.fraccionSuma(f1, f2);
		f4.imprimirFraccion();
	
	}

}
