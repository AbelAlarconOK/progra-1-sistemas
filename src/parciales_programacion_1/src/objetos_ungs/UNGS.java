package objetos_ungs;

import java.util.ArrayList;

public class UNGS {
	Comision[] comisiones;

	/*
	 * Los arreglos inscriptos y calificaciones de una Comision tienen el mismo
	 * tama˜no y el valor de calificaciones[i] indica la calificacion obtenida por
	 * el estudiante inscriptos[i]. Para la clase UNGS, se pide: a) Escribir un
	 * metodo int enCuantasComisiones(Estudiante e) que devuelve la cantidad de
	 * comsiones en las que esta inscripto el estudiante e. b) Se pide escribir un
	 * metodo ArrayList<String> faltanDocentes() que devuelva una lista con todas
	 * las materias que tienen falta de docentes. En una materia faltan docentes, si
	 * mas de diez estudiantes por cada docente. c) (bonus track 20 pts.) Escribir
	 * un metodo Estudiante mejorPromedio() que devuelve el estudiante con el mejor
	 * promedio de calificaciones de la UNGS. Si hubiese mas de un estudiante en
	 * estas condiciones puede devolver cualquiera de ellos.
	 */

	public int enCuantasComisiones(Estudiante e) {
		int cant_veces = 0;
		for (int i = 0; i < comisiones.length; i++) {
			for (int j = 0; j < comisiones[i].inscriptos.length; j++) {
				if (comisiones[i].inscriptos[j].mismaPersona(e)) {
					cant_veces++;
				}
			}
		}
		return cant_veces;
	}

	public ArrayList<String> faltanDocentes() {
		ArrayList<String> lst = new ArrayList<String>();
		for (int i = 0; i < comisiones.length; i++) {
			if(comisiones[i].faltaDocente()) {
				lst.add( comisiones[i].materia);
			}
		}
		return lst;
	}
	
	public Estudiante mejorPromedio() {
		Estudiante n=null;
		double promedio=0;
		double mejor_promedio=0;
		for(int i=0;i<comisiones.length;i++) {
			for(int j=0;j<comisiones[i].inscriptos.length;j++) {
				promedio+=comisiones[i].calificaciones[j];
				if(promedio>=mejor_promedio) {
					mejor_promedio=promedio;
					n=comisiones[i].inscriptos[j];
				}
			}
		}
		return n;
	}
	
}
