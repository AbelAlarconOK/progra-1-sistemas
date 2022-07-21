package objetos_modulo7;

import java.util.LinkedList;

public class Laboratorio {
	int numero;
	int capacidad;
	PC[] computadoras;

	public boolean alta() {
		for (int i = 0; i < computadoras.length; i++) {
			for (int j = 0; j < computadoras[i].componentes.length; j++) {
				if (computadoras[i].componentes[j].marca.calidad >= 4) {
					return true;
				}

			}

		}
		return false;
	}
	



	

}
