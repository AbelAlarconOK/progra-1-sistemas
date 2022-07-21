package objetos_aerolinea;

public class Avion {
	String modelo;
	int anioFabricacion;
	Vuelo[] vuelos;
	

	public int cuantasVeceViajo(Pasajero t) {
		int cont =0;
		for (int i = 0; i < vuelos.length; i++) {
			for(int j=0;j<vuelos[i].pasajeros.length;j++) {
				if(vuelos[i].pasajeros[j].pasaporte==t.pasaporte){
					cont=cont+1;
				}
			}
		}
		return cont;
	}
	
	public  boolean esNacionalidad( String nacionalidad) {
		for(int j=0;j<vuelos.length;j++) {
			for (int i = 0; i < vuelos[j].pasajeros.length;i++) {
				if(vuelos[j].pasajeros[i].nacionalidad.equals(nacionalidad));{
					return true;
				}
		}
		
		}
		return false;
	}

}
