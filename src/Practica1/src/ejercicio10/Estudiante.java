package ejercicio10;

public class Estudiante {
	String nombre;
	int legajo;
	
	
	public Estudiante(String nombre, int legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	public boolean mismaPersona(Estudiante t) {
		return this.nombre==t.nombre && this.legajo==t.legajo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

}
