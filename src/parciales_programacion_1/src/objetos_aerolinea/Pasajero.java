package objetos_aerolinea;

public class Pasajero {
	int pasaporte;
	int edad;
	String nacionalidad;
	
	public boolean nacionalidadEdad(String s, int e) {
		return (nacionalidad.equals(s) && edad>=e);
	}

}
