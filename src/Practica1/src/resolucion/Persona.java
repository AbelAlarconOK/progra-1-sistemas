package resolucion;

public class Persona {
	private String nombre;
	private int edad;
	private int dni;

	public Persona(String name, int age, int dni) {
		this.setNombre(name);
		this.setEdad(age);
		this.setDni(dni);
	}

	// METODOS DE INSTANCIA.

	public boolean esMasJoven(Persona p2) {
		return (this.edad < p2.edad);
	}

	public boolean esTocayo(Persona p2) {
		return this.nombre.equals(p2);
	}

	public boolean mismaPersona(Persona p2) {
		// return (this.edad == p2.edad && esTocayo(p2))
		return this.dni == p2.dni;
	}

	// METODOS DE CLASE
	public static Persona buscar(Persona[] grupo, String nombre) {
		if (grupo.length >= 1 && grupo[0] != null) {
			Persona candidato = grupo[0];
			for (int i = 0; i < grupo.length; i++) {
				if (grupo[i].nombre == nombre) {
					candidato = grupo[i];
				}
				
			}
			return candidato;
		}
		return null;
	}

	public static Persona masJoven(Persona[] grupo) {
		if (grupo.length >= 1 && grupo[0] != null) {
			Persona candidato = grupo[0];
			for (int i = 0; i < grupo.length; i++) {
				if (grupo[i] != null && grupo[i].esMasJoven(candidato))
					candidato = grupo[i];
			}
			return candidato;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
