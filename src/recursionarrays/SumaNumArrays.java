package recursionarrays;

public class SumaNumArrays {
	
	public static void imprimir(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	public static int [] resto (int [] s) {
		int [] nueva = new int [s.length-1];
		int k=0;
		for(int i =1;i<s.length;i++) {
			nueva[k++]=s[i];
		}
		return nueva;
	}
	
	public static int suma(int [] a) {
		if(a.length==0) {
			return 0;
		}
		return a[0]+suma(resto(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [6]; int pos;
		pos=0;
		array[pos++]=1;
		array[pos++]=2;
		array[pos++]=3;
		array[pos++]=4;
		array[pos++]=5;
		array[pos++]=6;
		System.out.println(suma(array));
	}


}
