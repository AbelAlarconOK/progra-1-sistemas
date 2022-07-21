package practicaCero;

import java.util.Scanner;

public class Palindrome {

	
	public static boolean esPalindrome(String a) {
		String nueva ="";
		 for(int i=a.length()-1; i>=0;i--) {
			 nueva = nueva+a.charAt(i);
		 }
		 if (a.compareTo(nueva)==0) {
			 return true;
		 }else {
			 return false;
		 }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		scan.close();
		System.out.println(esPalindrome(palabra));
	}

}
