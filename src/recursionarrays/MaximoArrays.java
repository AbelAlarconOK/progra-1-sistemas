package recursionarrays;

public class MaximoArrays {

	
	public static int maximo(int a []  ,int pos) {
		int res;
		if(pos==a.length-1) {//Caso base: pos indica el ultimo elemento de a. //En este caso este sera el maximo.
			res=a[pos];
		}else {
			int k;
			k=maximo(a,pos+1);//K sera el mayor de la posicion desde la pos+1 hasta hasta el ultimo elemento.
			if(a[pos]>k){//Si a[pos]es mayor que K.
				res=a[pos];//a[pos] es el maximo.
			}else {
				res=k;//En caso contrario k es el maximo.
			}
		}
		return res;
	}
	
	
	public static int MAXIMO(int a []) {
		return(maximo(a,0));
	}
	
	
	public static void main(String[] args) {
		int datos [];
		int max;
		
		//DEFINE UNA LISA DE 10 ENTEROS.
		datos = new int[10];
		for(int i =0; i<datos.length;i++){
			datos[i]=(int)(Math.random()*1000+1);
		}
		System.out.println("Loa datos son: ");
		for(int i =0;i<datos.length;i++) {
			System.out.print(datos[i]+" ");
		}
		max=MAXIMO(datos);
		System.out.println("\nEl maximo es: "+ max);
	}
}
