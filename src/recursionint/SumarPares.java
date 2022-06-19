package recursionint;

public class SumarPares {
	
	public static boolean par(int n) {
		if(n%2==0) {
			return true;
		}
		return false;	
	}
	
	public static int sumarPar(int n) {
		// obtener 2+4+6+...+n para n>=0
		if(n==0) {
			return n;
		}
		else {
			if(par(n)) {
				return n+sumarPar(n-1);
			}
			else {
				return sumarPar(n-1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		System.out.println(sumarPar(n));

	}

}
