package torrehanoi;

public class TorreHanoi {
	
	public static void HANOI(int n) {
		char a ='a';
		char b ='b';
		char c ='c';
		hanoi(n,a,b,c);
	}
	
	public static void hanoi(int n, char a, char b, char c) {
		if(n==1) {
			System.out.println("mover de "+a+" a "+c);
		}else {
			hanoi(n-1,a,c,b);
			System.out.println("mover de "+a+" a "+c);
			hanoi(n-1,b,a,c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HANOI(3);
	}

}
