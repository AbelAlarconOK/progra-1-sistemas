package resolucion;

public class AgendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agend= new Agenda(3);
		
		Persona p1=new Persona("Abel",48,4063497);
		Persona p2= new Persona("Ariel",40,40634979);
		Persona p3= new Persona("Abel",48, 4063497);
		
		Persona [] grup= new Persona [3];
		grup[0]=p1;
		grup[1]=p2;
		grup[2]=p3;
		
		String [] telefono = {"1234","4567","8910"};
		
		agend.telefonos=telefono;
		agend.contactos=grup;
		
		System.out.println(agend.toString());
		System.out.println(agend.contactos[0].esMasJoven(p2));
		System.out.println(agend.telefonos[0].equals(telefono[1]));
		System.out.println(agend.contactos[0].mismaPersona(agend.contactos[2]));
		agend.eliminar(p2);
		System.out.println(agend.toString());

	}

}
