package practicaCero;

public class CantidadCifras {

	public static int cantCifras(int num) {
		int resultado = 0;
		while (num > 0) {
			resultado=resultado+1;
			num = num/10;
		}return resultado;
	}
	
	
	static boolean divisible(int a, int b) {
		if(a%b==0) {
			return true;
		}
		return false;
		}

	public static void main(String[] args) {
		System.out.println(cantCifras(1000));
		System.out.println(divisible(8,5));
	}
}
