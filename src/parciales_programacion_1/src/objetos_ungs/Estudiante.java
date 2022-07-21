package objetos_ungs;

public class Estudiante {
	String nombre;
	int legajo;
	
	public boolean mismaPersona(Estudiante t) {
		return legajo==t.legajo && nombre==t.nombre;
	}
}
