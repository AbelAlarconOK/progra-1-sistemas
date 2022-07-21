package ejercicio11;

public class Vuelo {
	Avion avion;
	Tripulante[] tripulacion;

	public Vuelo(Avion avion, Tripulante[] tripulacion) {
		this.avion = avion;
		this.tripulacion = tripulacion;
	}

	public Vuelo() {
		// TODO Auto-generated constructor stub
	}

	public void imprimir() {
		System.out.println("El vuelos es: " + this.avion.tipo);
	}

	public boolean viaja(Tripulante t) {
		for (int i = 0; i < tripulacion.length; i++) {
			if (tripulacion[i].equals(t)) {
				return true;
			}
		}
		return false;
	}

	public boolean viajaComoPiloto( Tripulante t) {
		for(int i=0;i<tripulacion.length;i++) {
			if(tripulacion[i].equals(t)&&tripulacion[i].cargo.equals("piloto")) {
				return true;
			}
		}
		return false;
	}


	public int cantTripulantesCargo(String cargo) {
		int cont = 0;
		for (int i = 0; i < tripulacion.length; i++) {
			if (tripulacion[i].cargo.equals(cargo))
				cont++;
		}
		return cont;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Tripulante[] getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(Tripulante[] tripulacion) {
		this.tripulacion = tripulacion;
	}

}
