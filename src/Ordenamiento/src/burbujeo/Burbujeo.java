package burbujeo;

public class Burbujeo {

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
	
	public static void ordenarPorBurbujeo(int [] a) {
		for(int i= a.length-1;i>0;i--) {
			for(int j =0;j<i;j++) {
				if(a[j]>a[j+1])
					swap(a, j, j+1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		/*COMPARAR LOS DOS PRIMEROS ELEMENTOS Y DEJAR EL MAS GRANDE A LA DERECHA.
		 *COMPARAR AHORA EL SEGUNDO Y Y TERCER ELEMENTOS Y HAER LOS MISMO.
		 *DE ESTA MANERA SEGURO QUE EL MAYOR ELEMENTOS QUEDARA A LO ULTIMO.
		 *VOLVEMOS A REPETIR EL PROCESO, PERO LLEGANDO SOLO HASTA EL ANTEULTIMO ELEMENTO, PUES YA ERA EL MAS GRANDE.
		 */
		
		int [] numeros = {8,10,2,7,14,59,30,4,12,6};
		ordenarPorBurbujeo(numeros);
		imprimir(numeros);
		
	}

}
