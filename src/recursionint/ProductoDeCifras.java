package recursionint;

public class ProductoDeCifras {
	
	public static int productosDeCifras(int n) {
		if(n<10) {//caso base.
			return n;
		}
		//recursivo.
		if(n%10==0) {
			return productosDeCifras(n/10);
		}else {
			return n%10*productosDeCifras(n/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(productosDeCifras(1234));

	}

}
