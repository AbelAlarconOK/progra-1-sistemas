package resolucion;

public class ArreglosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arreglos  arr []= new Arreglos[3];
		
		arr [0] = new Arreglos(2); 
		arr [1] = new Arreglos(3);
		arr [2] = new Arreglos(4);
		System.out.println(arr[1].edad);
		
		int [] arr2= {1,2,2,3,4,5,5};
		int [] arr3= {6,10,7,6,8,9,9,10,10,10,7,8,9,6};
		//System.out.println(Arreglos.esSinRepetir(arr2));
		
		//Arreglos.imprimir(Arreglos.concatenarArray(arr2, arr3));
		//Arreglos.imprimir(Arreglos.sinRepetir(arr3));
		System.out.println(Arreglos.cantidadRepetidos(arr3));
		Arreglos.imprimir(Arreglos.sinRepetir(arr2));
		System.out.println(Arreglos.esSinRepetir(arr2));
	}

}
