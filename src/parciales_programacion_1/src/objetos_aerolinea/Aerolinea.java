package objetos_aerolinea;

import java.util.ArrayList;

public class Aerolinea {
	String nombre;
	Avion[] aviones;

	public ArrayList<Pasajero> cantAvionesPasajesDeNac(String s) {
		ArrayList<Pasajero> lst= new ArrayList<Pasajero>();
			for (int i = 0; i <aviones.length; i++) {
				for (int j = 0; j <aviones[i].vuelos.length; j++) {
					for(int t=0;t<aviones[i].vuelos[j].pasajeros.length;t++) {
						if(
							aviones[i].vuelos[j].pasajeros[t].nacionalidadEdad("chino",18) &&
							aviones[i].vuelos[j].destino.equals("singapur") ) {
							if(!lst.contains(aviones[i].vuelos[j].pasajeros[t])) {
								lst.add(aviones[i].vuelos[j].pasajeros[t]);
							}
						}
					}
				}
			}
			return lst;
	}
	
	public Pasajero masFrecuente() {
		Pasajero masViajo = aviones[0].vuelos[0].pasajeros[0];
		int viajes= 0;
		int viajes2=0;
		
		for(int i=0;i<aviones.length;i++) {
			for(int j=0;j<aviones[i].vuelos.length;j++) {
				for(int t=0;t<aviones[i].vuelos[j].pasajeros.length;t++) {		
					viajes2 =aviones[i].cuantasVeceViajo(aviones[i].vuelos[j].pasajeros[t]) ;
					if(viajes<=viajes2) {
						viajes=viajes2;
						masViajo=aviones[i].vuelos[j].pasajeros[t];
					}
				}
			}
		}
		return masViajo;
	}
}
