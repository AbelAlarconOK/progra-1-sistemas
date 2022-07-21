package objetos_ungs;

public class Comision {
	String materia;
	int numero;
	Docente[] docentes;
	Estudiante[] inscriptos;
	int[] calificaciones;
	
	
	public boolean faltaDocente() {
		return (inscriptos.length%docentes.length>10);
	}
	
}
