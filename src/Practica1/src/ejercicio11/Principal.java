package ejercicio11;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRIMER GRUPO DE TRIPULANTES:
		Tripulante [] grupo1= new Tripulante[3];
		
		grupo1[0]= new Tripulante("abel", "piloto", 15);
		grupo1[1]= new Tripulante("paola", "aeromozo", 20);
		grupo1[2]= new Tripulante("ludmila", "piloto", 10);	
		
		//SEGUNDO GRUPO DE TRIPULANTES:
		Tripulante [] grupo2= new Tripulante[3];
		
		grupo2[0]= new Tripulante("dario", "piloto", 40);
		grupo2[1]= new Tripulante("ariel", "inspector", 20);
		grupo2[2]= new Tripulante("abel", "piloto", 15);
		
		//TERCER GRUPO DE TRIPULANTES:
		Tripulante [] grupo3= new Tripulante[3];
		
		grupo3[0]= new Tripulante("abel", "piloto", 15);
		grupo3[1]= new Tripulante("cielo", "aeromozo", 20);
		grupo3[2]= new Tripulante("ludmila", "piloto", 10);
		
		//CANTIDAD DE AVIONES:
		Avion avion1= new Avion("sulu", 30);
		Avion avion2= new Avion("alfa", 20);
		Avion avion3= new Avion("bravo", 10);

		//CANTIDAD DE VUELOS:
		Vuelo [] vuelo1= new Vuelo[3];
		vuelo1[0]= new Vuelo(avion1, grupo1);
		vuelo1[1]= new Vuelo(avion2, grupo2);
		vuelo1[2]= new Vuelo(avion3, grupo3);
		
		//CREO LA AEROLINEA
		Aerolinea aero= new Aerolinea(vuelo1);
		
		System.out.println("\tMOSTRAS VUELOS");
		aero.imprimir();
		
		
		Vuelo  vuelo= new Vuelo();	
		vuelo = aero.elMasInspeccionado();
		System.out.println("\n");
		System.out.println("\tVUELO CON MAS INSPECTORES");
		System.out.println("\nEl vuelos con mas inspectores es: "+ vuelo.avion.getTipo());
		
		System.out.println();
		System.out.println("\tVUELO SOBRECARDAGO\n");
		System.out.println(aero.hayVuelosSobrecargados()+"\n");
		
		
		System.out.println("\tPRIMER PILOTO\n");
		Tripulante persona = new Tripulante();		
		persona= aero.primerPiloto();
		
		System.out.println(persona.getNombre());
		System.out.println("VUELOS: "+aero.cuantasVeceComoPiloto(persona));
		
		System.out.println("\tPILOTO DEL MES\n");
		Tripulante piloto_mes = aero.tripulanteDelMes();
		
		System.out.println(piloto_mes.getNombre());
		System.out.println("VUELOS: "+aero.cuantasVeceComoPiloto(piloto_mes));
				
	}

}
