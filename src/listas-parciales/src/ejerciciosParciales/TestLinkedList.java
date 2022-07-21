package ejerciciosParciales;

import java.util.LinkedList;

public class TestLinkedList {
	
	
	public static void main(String[] args) {
		LinkedList<String> palabras = new LinkedList<String> ();
		
		palabras.addFirst("Pepe");
		palabras.addFirst("Pipi");
		palabras.addLast("chau");
		
		System.out.println(palabras);
		System.out.println(palabras.get(1));
		palabras.remove(1);
//		palabras.remove("chau");
		System.out.println(palabras);
	

		LinkedList<Integer> notas = new LinkedList<Integer>();
		notas.addFirst(7);
		notas.addLast(5);
		notas.add(4);
		System.out.println(notas);
		System.out.println(notas.contains(3));
			
	}


}
