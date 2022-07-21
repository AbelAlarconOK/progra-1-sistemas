package ejercicio10;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Docente [] doc = new Docente [3];
		doc[0] = new Docente("Paola", 203040);
		doc[1] = new Docente("Cielo", 304050);
		doc[2] = new Docente("Ludmila", 102030);
		
		Docente [] doc2 = new Docente [3];
		doc2[0] = new Docente("Pao", 304050);
		doc2[1] = new Docente("Cie", 405060);
		doc2[2] = new Docente("Ludmila", 102030);
		
		Estudiante [] est = new Estudiante[3];
		est[0] = new Estudiante("Ariel",1020 );
		est[1] = new Estudiante("Maria",2040 );
		est[2] = new Estudiante("Dario",3040 );

		
		Estudiante [] est2 = new Estudiante[3];
		est2[0] = new Estudiante("Ariel",1020 );
		est2[1] = new Estudiante("Maria",2040 );
		est2[2] = new Estudiante("Dario",3040 );
		
		int [] calificacion= new int [est.length];
		calificacion[0]=10;
		calificacion[1]=7;
		calificacion[2]=15;

		int [] calificacion2= new int [est2.length];
		calificacion2[0]=5;
		calificacion2[1]=2;
		calificacion2[2]=4;
		
		
		Comision com1= new Comision("Programacion", 12, doc, est, calificacion);
		Comision com2= new Comision("Pesec", 10, doc2, est2, calificacion2);
		
		Comision [] comisiones = new Comision[2];
		comisiones[0]=com1;
		comisiones[1]=com2;
				
		UNGS ungs = new UNGS(comisiones);
		
		
		System.out.println(com1.estaAlumno(est2[0]));
		System.out.println(com1.estaDocente(doc[0]));
		
		System.out.println(	ungs.cursaCon(est[0], doc2[0]));
		
		System.out.println(com1.suficientesDocentes());
		
		
		System.out.println(com2.aprobado(est2[2]));
		System.out.println(ungs.cantidadVecesAprobo(est2[2]));
		Estudiante mejor = ungs.elMasEstudioso();
		System.out.println(mejor.getNombre());
		System.out.println(com1.mejorNota(mejor));
		
	}

}
