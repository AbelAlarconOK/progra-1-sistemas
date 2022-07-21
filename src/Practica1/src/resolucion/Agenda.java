package resolucion;

import java.util.Arrays;

public class Agenda {
    Persona[] contactos;
    String[] telefonos;
    int primerPosNull;
    
    //CONSTRUCTOR
    
    Agenda(int tamanio){
    	this.contactos = new Persona[tamanio];
    	this.telefonos = new String[tamanio];
    	this.primerPosNull=0;
    }
    
    void guardar(Persona contacto, String telefono) {
    	if(this.primerPosNull<contactos.length) {
    		contactos[this.primerPosNull]=contacto;
    		telefonos[this.primerPosNull]=telefono;
    		
    	}else {//AGRANDAR AGENDA;
    		Agenda nueva = new Agenda(contactos.length+1);
    		//COPIAMOS ELEMENTOS;
    		for(int i =0;i<contactos.length;i++) {
    			nueva.contactos[i]=this.contactos[i];
    			nueva.telefonos[i]=this.telefonos[i];
    		}
    		nueva.contactos[contactos.length]=contacto;
    		nueva.telefonos[contactos.length]=telefono;
    		this.contactos=nueva.contactos;
    		this.telefonos=nueva.telefonos;
    	}
    	this.primerPosNull++;
    }
    
	static Persona [] eliminarPos(Persona[] a, int pos) {
		if (0 <= pos && pos < a.length) {
			int k = 0;
			Persona [] b = new Persona [a.length - 1];
			for (int i = 0; i < a.length; i++) {
				if (i != pos) {
					b[k++] = a[i];
				}
			}
			return b;
		}
		return a;
	}
	
	static String [] eliminarPos(String [] a, int pos) {
		if (0 <= pos && pos < a.length) {
			int k = 0;
			String [] b = new String [a.length - 1];
			for (int i = 0; i < a.length; i++) {
				if (i != pos) {
					b[k++] = a[i];
				}
			}
			return b;
		}
		return a;
	}
	

    
    public void eliminar(Persona contacto) {
    	int cont=0;
    		for(int i =0;i<contactos.length;i++) {
    			if(contactos[i]!=contacto) {
    				cont++;
    			}else {
    				this.contactos= eliminarPos(contactos,cont);
    				this.telefonos= eliminarPos(telefonos,cont);
    			}
    		}
    	}

	@Override
	public String toString() {
		return "Agenda [contactos=" + Arrays.toString(this.contactos) + ", telefonos=" + Arrays.toString(telefonos)
				+ ", primerPosNull=" + primerPosNull + "]";
	}
}
