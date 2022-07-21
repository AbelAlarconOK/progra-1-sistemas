package resolucion;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1= new Persona("Ariel",40,1234);
		Persona p2=new Persona("Abel",48,1234);
		System.out.println(p2.esMasJoven(p1));
		System.out.println(p2.esTocayo(p1));
		System.out.println(p2.mismaPersona(p1));
		
		Persona [] grup= new Persona [4];
		grup[0]=p1;
		grup[1]=p2;
		grup[2]= new Persona("dario",50,5678);
		grup[3]= new Persona("cielo",55,7891);
		
		Persona masjoven = Persona.masJoven(grup);
		
		//System.out.println(p1.toString());
		System.out.println(masjoven.toString());
		
		System.out.println(grup[0].mismaPersona(p2));
		System.out.println(Persona.buscar(grup, "ariel"));
		
	}

}
