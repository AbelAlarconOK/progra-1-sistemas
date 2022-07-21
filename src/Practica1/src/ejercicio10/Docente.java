package ejercicio10;

public class Docente {
	String nombre;
	int dni;
	
	
	public Docente(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}

}
