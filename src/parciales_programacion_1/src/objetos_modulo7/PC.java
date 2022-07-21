package objetos_modulo7;

public class PC {
	String serial;
	String modelo;
	String OS;
	Componente[] componentes;

	public boolean mismaMarca2(Marca m) {
		for (int i = 0; i < componentes.length; i++) {
				if (componentes[i].marca==m) {
					return true;
				}

		}
		return false;

	}
	

}
