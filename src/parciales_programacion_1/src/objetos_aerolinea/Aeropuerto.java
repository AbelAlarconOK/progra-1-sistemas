package objetos_aerolinea;


public class Aeropuerto {
	Aerolinea[] aerolineas;

	/*
	 * Estas clases modelan un aeropuerto. Un Aeropuerto esta compuesto por un
	 * arreglo con aerolineas y cada aerolinea tiene un nombre y un arreglo con los
	 * aviones que forman parte de ella. A su vez, cada avion tiene su modelo, el
	 * a˜no en que fue fabricado y los vuelos que realiza. Por ultimo, el vuelo
	 * tiene los empleados que realizan el vuelos, los pasajeros que van en el, un
	 * origen, un destino y la capacidad maxima de pasajeros que puede alojar. Para
	 * la clase Aeropuerto, se pide: Escribir un metodo int
	 * cantAvionesPasajesDeNac(String nacionalidad) que recibe una nacionalidad y
	 * devuelve la cantidad de aviones que trasportan pasajeros de esa nacionalidad
	 * en el Aeropuerto. El aeropuerto realiza un control especial a los pasajeros
	 * de origen chino, mayores de edad que vuelen a Singapur. Para ello, se pide
	 * escribir un metodo ArrayList<Pasajero> chinosQueViajanASingapur() que
	 * devuelva una lista con los pasajeros que vuelen a Singapur, de nacionalidad
	 * China y mayores a 18 a˜nos de edad. La lista no debe contener elementos
	 * repetidos. (bonus track 20 pts.) El aeropuerto va a lanzar un beneficio,
	 * regalandole un pasaje gratis por dia al pasajero que mas vuelos haya tomado.
	 * Para ello, se pide escribir un metodo Pasajero masFrecuente() que devuelva el
	 * Pasajero que aparezca en la mayor cantidad de vuelos en el Aeropuerto. En
	 * caso de haber mas de un pasajero con estas caracteristicas se puede devolver
	 * cualquiera de ellos.
	 */

	
	
	/*NOSE SI ESTAN BIEN LOS RESULTADOS DE TODOS ESTOS EJERCICIOS*/
	
	public int cantAvionesPasajesDeNac(String s) {
		
//		int cont=0;
//		for(Aerolinea v : aerolineas ) {
//			for(Avion a : v.aviones) {
//				for(Vuelo t : a.vuelos ) {
//					if(t.esNacionalidad(s)) {
//						cont++;
//					}
//				}
//			}
//			return cont;
//		}
		
		int cont = 0;
		for (int i = 0; i < aerolineas.length; i++) {
			for (int j = 0; j < aerolineas[i].aviones.length; j++)  {
					if (aerolineas[i].aviones[j].esNacionalidad(s)) {
						cont++;
					}
				}
			}
		return cont;
	}
	
}


