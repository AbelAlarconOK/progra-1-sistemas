package practica2;

public class ListaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaInt lst = new ListaInt();
		lst.agregarAdelante2(4);
		lst.agregarAdelante2(3);
		lst.agregarAdelante2(2);
		lst.agregarAdelante2(1);


		
//		lst.comenzar();
	
//		System.out.println(lst.largo());
//		System.out.println(lst.estaVacia());
//		
//		System.out.println(lst.sumar());
//		
//		System.out.println(lst.promedio());
//		
//		System.out.println(lst.isemio(1));
//		lst.imprimir();
//		
//		System.out.println(lst.maximo());
//		
//		//System.out.println(lst.estaOrdenada());
//		System.out.println(lst.esSinDuplicados());
//		
//		lst.rotarDerecha();
//		lst.imprimir();
//		lst.acomodarBandera();
//		lst.imprimir();
	
		lst.duplicarReflejado();
		lst.imprimir();
	}

}
