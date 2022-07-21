package ejercicio10;

public class Comision {
	String materia;
	int numero;
	Docente[] docentes;
	Estudiante[] inscriptos;
	int[] calificaciones;

	public Comision(String materia, int numero, Docente[] docentes, Estudiante[] inscriptos, int[] length) {
		this.materia = materia;
		this.numero = numero;
		this.docentes = docentes;
		this.inscriptos = inscriptos;
		this.calificaciones = length;
	}

	public Comision() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean aprobado(Estudiante t) {
		int indice = indiceAlumno(t);
		return calificaciones[indice]>=4;
	}

	public boolean estaAlumno(Estudiante t) {
		for (int i = 0; i < inscriptos.length; i++) {
			if (inscriptos[i].equals(t)) {
				return true;
			}
		}
		return false;
	}

	public boolean estaDocente(Docente d) {
		for (int i = 0; i < docentes.length; i++) {
			if (docentes[i].equals(d)) {
				return true;
			}
		}
		return false;
	}

	public boolean suficientesDocentes() {
		return docentes.length >= 1 && inscriptos.length <= 20;
	}

	public int indiceAlumno(Estudiante t) {
		int indice = 0;
		for (int i = 0; i < inscriptos.length; i++) {
			if (inscriptos[i].equals(t)) {
				indice = i;
			}

		}
		return indice;
	}
	
	public int mejorNota(Estudiante t) {
		int indice = indiceAlumno(t);
		int nota =calificaciones[indice];
		for(int i=0;i<inscriptos.length;i++) {
			if(calificaciones[i]>=nota) {
				nota=calificaciones[i];
			}
		}
		return nota;
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Docente[] getDocentes() {
		return docentes;
	}

	public void setDocentes(Docente[] docentes) {
		this.docentes = docentes;
	}

	public Estudiante[] getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(Estudiante[] inscriptos) {
		this.inscriptos = inscriptos;
	}

	public int[] getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(int[] calificaciones) {
		this.calificaciones = calificaciones;
	}



}
