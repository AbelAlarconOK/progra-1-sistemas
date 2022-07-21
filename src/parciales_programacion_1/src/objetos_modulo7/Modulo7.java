package objetos_modulo7;

import java.util.LinkedList;

public class Modulo7 {
	Laboratorio[] labos;

	/*
	 * Estas clases modelan los laboratorios que posee el Modulo7. Cada laboratorio
	 * posee computadoras que estan compuestas por componentes. Cada Componente es
	 * una determinada marca que tiene un estandar de calidad, por lo cual segun la
	 * marca y especificaciones se le asigna un valor entre 1 y 5 a la calidad del
	 * componente. Para la clase Modulo7, se pide: a) Escribir un metodo
	 * LinkedList<Componente> componentesPorMarca(Marca m) que devuelva una lista
	 * con todos los componentes del modulo 7 que coincidan con la marca recibida
	 * por parametro. La lista no debe contener elementos repetidos. b) Escribir un
	 * metodo boolean gamaAlta() que determina si existe una pc en el modulo 7 que
	 * sea de alta gama. Se considera que una pc es de alta gama si todos sus
	 * componentes tienen calidad mayor o igual a 4. c) (bonus track 20 pts.)
	 * Escribir un metodo Marca marcaMasUsada() que devuelva la marca que mas
	 * componentes provee al modulo 7. En caso de tener mas de una Marca con estas
	 * condiciones, se debe devolver cualquiera de ellas.
	 */

	
	/*NOSE SI ESTA BINE LOS EJERCICIOS RESUELTOS*/
	
	LinkedList<Componente> componentesPorMarca(Marca m){
		LinkedList<Componente> lst = new LinkedList<Componente>();
		for(int i=0;i<labos.length;i++) {
			for(int j=0;j<labos[i].computadoras.length;j++) {
				for(int t=0;t<labos[i].computadoras[j].componentes.length;t++) {
					if(labos[i].computadoras[j].componentes[t].mismaMarca(m)) {
						if(!lst.contains(labos[i].computadoras[j].componentes[t])) {
							lst.add(labos[i].computadoras[j].componentes[t]);
						}
					}
				}
			}
		}
		return lst;
	}
	

	
	
	public boolean gamaAlta() {
		for(int i=0;i<labos.length;i++) {
			if(labos[i].alta()) {
				return true;
			}
		}
		return false;
	}

}
