package ejercicio11;

import java.util.Arrays;

public class Aerolinea {
	Vuelo[] vuelos;

	public Aerolinea(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	/*
	 * Escribir un metodo int vuelosEn(Tripulante t, String tipoAvion) que recibe un
	 * tripulante t y un tipo de avion e indica cuantos vuelos realizo t en aviones
	 * del tipo dado.
	 */

	public int vuelosEn(Tripulante t, String tipoAvion) {
		int cont = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (vuelos[i].avion.tipo.equals(tipoAvion) && vuelos[i].viaja(t)) {
				cont++;
			}
		}
		return cont;
	}

	/*
	 * Escribir un metodo int antiguedadPromedio(String tipoAvion) que recibe un
	 * tipo de avion y calcula el promedio de las antiguedades de los tripulantes en
	 * vuelos en aviones del tipo dado.
	 */
	public int antiguedadPromedio(String tipoavion) {
		int ant = 0;
		int cant = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (vuelos[i].avion.tipo.equals(tipoavion)) {
				cant = cant + (vuelos[i].tripulacion.length);
			}
			for (int j = 0; j < vuelos[i].tripulacion.length; j++) {
				ant = ant + vuelos[i].tripulacion[j].antiguedad;
			}
		}
		return ant / cant;
	}

	/*
	 * Escribir un metodo Vuelo elMasInspeccionado() que devuelve el vuelo en el que
	 * se hayan transportado mas tripulantes con cargo de “Inspector”. En caso de
	 * haber mas de un vuelo con la misma cantidad de inspectores, puede devolver
	 * cualquiera de ellos.
	 */

	public Vuelo elMasInspeccionado() {
		Vuelo v = new Vuelo();
		v = vuelos[0];

		for (int i = 0; i < vuelos.length; i++) {
			if (v.cantTripulantesCargo("inspector") < ((vuelos[i].cantTripulantesCargo("inspector")))) {
				v = vuelos[i];
			}
		}
		return v;
	}

	/*
	 * Escribir un metodo boolean hayVueloSobrecargado() que devuelve true cuando
	 * hay al menos un vuelo en el que la cantidad de tripulantes con cargo de
	 * “Aeromozo” supere el 10 % de la capacidad del avion.
	 */

	public boolean hayVuelosSobrecargados() {
		for (int i = 0; i < vuelos.length; i++) {
			if (vuelos[i].cantTripulantesCargo("aeromozo") > (vuelos[i].avion.capacida * 10 / 100)) {
				return true;
			}
		}
		return false;
	}
	
	public Tripulante primerPiloto() {
		Tripulante piloto =null;
		for(int i=0;i<vuelos.length;i++) {
			for(int j=0;j<vuelos[i].tripulacion.length;j++) {
				if(vuelos[i].tripulacion[j].cargo.equals("piloto"))
					piloto=vuelos[i].tripulacion[j];
			}
		}
		return piloto;
	}
	

	public int cuantasVeceComoPiloto(Tripulante t) {
		int cont =0;
		for (int i = 0; i < vuelos.length; i++) {
			for(int j=0;j<vuelos[i].tripulacion.length;j++) {
				if(vuelos[i].tripulacion[j].cargo.equals("piloto")&&vuelos[i].tripulacion[j].mismaPersona(t)){
					cont=cont+1;
				}
			}
		}
		return cont;
	}
	
	

	
	public  Tripulante tripulanteDelMes() {
		Tripulante primer_piloto = primerPiloto();
		int cant_vuelos = cuantasVeceComoPiloto(primer_piloto);
		int cant_otro=0;
		Tripulante otro_piloto = null;
		for(int i=0;i<vuelos.length;i++) {
			for(int j=0;j<vuelos[i].tripulacion.length;j++) {
				if(vuelos[i].tripulacion[j].mismaPersona(primer_piloto)==false && vuelos[i].tripulacion[j].piloto()) {
					cant_otro= cuantasVeceComoPiloto(vuelos[i].tripulacion[j]);
					otro_piloto=vuelos[i].tripulacion[j];
				}
				if(cant_otro>=cant_vuelos) {
					cant_vuelos=cant_otro;
					primer_piloto=otro_piloto;
				}
			}
		}
		return primer_piloto;
		
	}
	

	
	

	@Override
	public String toString() {
		return "Aerolinea [vuelos=" + Arrays.toString(vuelos) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void imprimir() {
		for (int i = 0; i < vuelos.length; i++) {
			System.out.print("\nEl tipo de avion es[" + this.vuelos[i].avion.tipo + "]");
			System.out.print("La capacidad del avion es [" + this.vuelos[i].avion.capacida + "]");
			System.out.print("La cantidad de tripulantes es [" + this.vuelos[i].tripulacion.length + "]");
		}
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}









}
