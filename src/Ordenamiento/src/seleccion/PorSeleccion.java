package seleccion;

public class PorSeleccion {
	
	public static void imprimir(int [] a) {
		System.out.print("[ ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
	
	public static void swap(int [] a, int i, int j) {
		int aux = a[i];
		a[i]=a[j];
		a[j]=aux;
	}
	
	public static void ordenSeleccion(int [] a) {
		for(int i=0;i<a.length;i++) {
			int menor=i;
			for(int j=i+1;j<a.length;j++ ) {
				if(a[j]<a[menor])
					menor=j;
			}
			swap(a,i,menor);
		}
		
	}
	

	public static void main(String[] args) {
		
		/*BUSCAR EL MENOR ELEMENTO DEL ARREGLO Y PONERLO AL PRINCIPIO DEL MISMO.
		 *BUSCAR EL MENOR ELEMENTO DE LO QUE QUEDA DEL ARREGLO Y PONERLO EN LA SEGUNDA POSICION DEL ARREGLO.
		 *BUSCAR EL MENOR ELEMENTO DEL RESTO DEL ARREGLO Y PONERLO EN LA TERCERA POSICION.
		 *SEGUIMOS HASTA QUE HALLAMOS, LLENADO TODAS LAS POSICIONES DEL ARREGLO CON LOS ELEMENTOSS CORRESPONDIENTES.
		 * */
		
		int [] numeros = {8,10,2,7,14,59,30,4,12,6};
		ordenSeleccion(numeros);
		imprimir(numeros);
	}
	

}
