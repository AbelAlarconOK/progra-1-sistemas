package objetos;

public class FechaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fechas f2 = new Fechas(10, 12, 2020);		
		System.out.println(Fechas.diasDelMes(2, 2022));		
		System.out.println(f2.getClass());
		System.out.println(f2.toString());
		System.out.println(f2.esValido());
		f2.imprimir();
		System.out.println(f2.avanzaUnDia());
		f2.imprimir();
		System.out.println(f2.estaAntes(9, 13, 2022));
	}

}
