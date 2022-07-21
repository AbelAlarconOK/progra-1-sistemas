package ejercicio10;

public class UNGS {
	private Comision[] comisiones;

	public UNGS(Comision[] comisiones) {
		this.comisiones = comisiones;
	}

	public UNGS(int i) {
		this.comisiones= new Comision[i];
	}

	

	public void setComisiones(Comision[] comisiones) {
		this.comisiones = comisiones;
	}
	
	public boolean cursaCon(Estudiante t , Docente d) {
		for(int i=0;i<comisiones.length;i++) {
			if(comisiones[i].estaAlumno(t)&&comisiones[i].estaDocente(d)) {
				return true;
			}
		}
		return false;
	}
	
	

	public int  cantidadVecesAprobo(Estudiante t) {
		int cont =0;
		for (int i = 0; i < comisiones.length; i++) {
			for(int j=0;j<comisiones[i].inscriptos.length;j++) {
				if(comisiones[i].aprobado(comisiones[i].inscriptos[j]) &&comisiones[i].inscriptos[j].mismaPersona(t)){
					cont=cont+1;
				}
			}
		}
		return cont;
	}
	
	

	public  Estudiante elMasEstudioso() {
		Estudiante primer_estudiante = comisiones[0].inscriptos[0];
		int cant_aprobado = cantidadVecesAprobo(primer_estudiante);
		int cant_otro=0;
		Estudiante otro_estudiante = null;
		for(int i=0;i<comisiones.length;i++) {
			for(int j=0;j<comisiones[i].inscriptos.length;j++) {
				if(comisiones[i].aprobado(comisiones[i].inscriptos[j])) {
					cant_otro= cantidadVecesAprobo(comisiones[i].inscriptos[j]);
					otro_estudiante=comisiones[i].inscriptos[j];
				}
				if(cant_otro>=cant_aprobado) {
					cant_aprobado=cant_otro;
					primer_estudiante=otro_estudiante;
				}
			}
		}
		return primer_estudiante;
	}
	

	
	
	public Comision[] getComisiones() {
		return comisiones;
	}

}
