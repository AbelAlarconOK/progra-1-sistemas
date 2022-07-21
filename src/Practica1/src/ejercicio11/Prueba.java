package ejercicio11;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] palabra= {"holam","hola","hola","asf","hola"};
		int cont=0;
		for(int i =0;i<palabra.length;i++) {
			if(palabra[i].equals("hola"))
				cont++;
		}
		System.out.println(cont);
	}

}
