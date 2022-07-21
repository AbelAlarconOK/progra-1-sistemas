package TrabajoPractico;

public class Receta {
	
	public class recetas{
		String nombre;
		Ingrediente[] ingredientes;
		double[] cantidades;//La posicion I ,indica la cantidad de ingredietnes de la posicion I del array ingredientes.
		boolean sinTaac;
		double costo;
		double precioVenta;
	}
	
	//IREP
	
	//NOMBRE != "" Y NO NULL.
	
	//INGREDIENTES.LENGTH==CANTIDADES.LENGTH.
	
	//SI SINTAAC==TRUE ENTONCES:
		//INGREDIENTES[I].SINTAAC==TRUE EN TODO EL ARRAY.
	
	//COSTO = ESLA SUMA DE:
		//INGREDIENTES[I].PRECIOUNITARIO * CANTIDAD[I] EN TODO EL ARRAY.
	
	//SINTAAC=TRUE:
		//PRECIOVENTA=COSTO*1,10.
	//SINTAC=FALSE:
		//PRECIOVENTA=COSTO*1,40.
	
	
	public class Ingrediente {
		String codigo;
		double precioUnitario;
		boolean sinTaac;
		}
	
	//IREP.
	
	//CODIGO.LENGTH==13.
	
	//PRECIOUNITARIO>0.
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
