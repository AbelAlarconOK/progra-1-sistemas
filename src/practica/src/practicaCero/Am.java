package practicaCero;

public class Am {

	public static String resto(String s) {
		String resto = "";
		for (int i = 1; i <= s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
	
	
	public static String primerAbecedaria(String a , String b) {
		if(a==b) {
			return a;
		}
		if(a.charAt(0)>b.charAt(0)) {
			return ""+a;
		}else {
			return ""+b;
		}	
	}

	public static void main(String[] args) {
		String a="pala";
		String b="casa";
		System.out.println(primerAbecedaria(a,b));
	}
}