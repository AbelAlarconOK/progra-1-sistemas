package insercion;

public class Insercion {
	
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
	
	public static void ordenarPorInsercion(int [] a) {
		for(int i=0;i<a.length;i++) {
			int pos=0;
			while(pos<i && a[pos]<a[i])
				pos++;
			
			int temp=a[i];
			for(int j=i-1;j>=pos;j--)
				a[j+1]=a[j];
			
			a[pos]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		
		/*SI EL SEGUNDO ELEMENTO DEL ARREGLO ES MAS CHICO QUE EL PRIMERO LOS INTERCAMBIAMOS.
		 *TENIENDO ESTOS DOS ELEMENTOS ORDENADOS, TOMAMOS EL TERCER ELEMENTO Y LO INSERTAMOS EN LA POSICION QUE CORRESPONDA
		 *CON RESPECTO A LOS DOS PRIMEROS ELEMENTOS.
		 *
		 *TENIENDO ESTOS TRES ORDENADOS, TOMAMOS EL CUARTO Y HACEMOS LO MISMO.
		 *SEGUIMOS ESTE PROCESO HASTA EL ULTIMO ELEMENTO DEL ARREGLO.
		 **/
		int [] numeros = {8,10,2,7,14,59,30,4,12,6};
		ordenarPorInsercion(numeros);
		imprimir(numeros);
	}

}
