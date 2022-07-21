package ejerciciosParciales;


public class ListaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaInt lst = new ListaInt();

		lst.agregarAdelante2(8);
		lst.agregarAdelante2(2);
		lst.agregarAdelante2(4);
		lst.agregarAdelante2(6);
		lst.agregarAdelante2(8);
		lst.agregarAdelante2(10);
		lst.agregarAtras2(20);

		//lst.agregarAdelante(3);
		//lst.agregarAdelante(3);
		//lst.agregarAdelante(3);
		//lst.imprimir();

	

		//lst.descomponerPares();
		//int  n =lst.primero.elemento;
		//System.out.println(n);

		//lst.imprimir();
		//lst.filtrarElementosEnRango(5, 8);
		//lst.imprimir();
		
		//ListaInt nueva = new ListaInt();
		//nueva=lst.extraerPares();
		//nueva.imprimir();
		//lst.imprimir();
		
		lst.filtrarElementosEnRango(5, 9);
		//lst.imprimir();
		
		lst.comenzar();
		lst.avanzar();
		lst.avanzar();
//		lst.retroceder();
//		lst.imprimir();

		//System.out.println(lst.termino());
		//System.out.println(lst.elementoActual());
		
		

		ListaInt lst2 = new ListaInt();

		lst2.agregarAdelante2(2);
		lst2.agregarAdelante2(5);
		lst2.agregarAdelante2(4);
		lst2.agregarAdelante2(3);
		
		
		//lst2.imprimir();
//		nueva.imprimir();
		ListaInt nueva = lst2.extraerPares2();
		nueva.imprimir();

	}

}
