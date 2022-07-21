package ejercicio11;

public class Avion {
	String tipo;
	int capacida;
	
	public Avion(String tipo, int capacida) {
		this.tipo = tipo;
		this.capacida = capacida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacida() {
		return capacida;
	}

	public void setCapacida(int capacida) {
		this.capacida = capacida;
	}

}
