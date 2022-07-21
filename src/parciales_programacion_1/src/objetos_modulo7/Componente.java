package objetos_modulo7;

public class Componente {
	String nombre;
	String tipo;
	Marca marca;
	
	
	public boolean mismaMarca(Marca n) {
		return marca==n;
	}
}
