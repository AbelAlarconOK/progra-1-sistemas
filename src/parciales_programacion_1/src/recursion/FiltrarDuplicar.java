package recursion;

public class FiltrarDuplicar {
	
/*Ejercicio 2 (25 pts.)
Escribir una funcion recursiva String filtrarYDuplicar(String s, String f) que dada una cadena s y otra cadena
f compuesta por ceros, unos y dos, retorne la cadena compuesta por aquellos caracteres de s cuya posicion
coincide con un valor igual a 1 o 2 en la cadena f, y si la posicion del caracter coincide con un 2, el caracter
aparece duplicado.
Por ejemplo:
filtrarYDuplicar(’’abcdefghi’’, ’’000111002’’) debe devolver ’’defii’’.
filtrarYDuplicar(’’abcdefghi’’, ’’110022’’) debe devolver ’’abeeff’’.
filtrarYDuplicar(’’abcd’’, ’’11100000111222’’) debe devolver ’’abc’’.
filtrarYDuplicar(’’abcd’’, ’’’’) debe devolver ’’’’.*/
	
	public static String resto(String s) {
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) {
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}
	
	public static String filtrarYDuplicar(String s, String f) {
		if(f.length()==0 || s.length()==0) {
			return "";
		}
		if(f.charAt(0)=='0') {
			return filtrarYDuplicar(resto(s),resto(f));
		}
		if(f.charAt(0)=='1') {
			return ""+s.charAt(0)+filtrarYDuplicar(resto(s),resto(f));
		}
		if(f.charAt(0)=='2') {
			return ""+s.charAt(0)+s.charAt(0)+filtrarYDuplicar(resto(s),resto(f));
		}
		return filtrarYDuplicar(resto(s),resto(f));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra ="abcdefghi";
		String palabra_dos ="110022";
		System.out.println(filtrarYDuplicar(palabra,palabra_dos));


	}

}
