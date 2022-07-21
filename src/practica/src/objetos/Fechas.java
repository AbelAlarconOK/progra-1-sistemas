package objetos;

public class Fechas {
	// Variables de instancia
	int dia;
	int mes;
	int anio;

	// Constructor/res
	Fechas() {
		this.dia = 5;
		this.mes = 4;
		this.anio = 2022;
	}

	Fechas(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	// Metodos
	// Metodo de instancia:
	// no lleva static
	// Puede acceder al parametro this
	// Se usa f.nombre-del-metodo()
	
	public boolean esValido() {
		if((this.dia>=1 && this.dia<=30) && (this.mes>=1 && this.mes<=12) && this.anio>=2000) {
			return true;
		}else {
			return false;
		}
	}
	
	public int avanzaUnDia() {
		return this.dia=this.dia+1;
	}
	
	public void imprimir() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}

	public String toString() {
		return this.dia + "/" + this.mes + "/" + this.anio;
	}
	
	public  boolean estaAntes(int d, int m , int anio) {
		if(this.anio>anio) {
		return false;
		}if (this.anio<=anio &&  this.mes<=m ) {
			return true;
		}else {
			return false;
		}
	}

	// Metodo de clase:
	// lleva static
	// NO accede al parametro this
	// se usa Fecha.nomre-del-metodo()
	public static boolean bisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0)
			return true;
		else if (anio % 400 == 0)
			return true;
		else
			return false;
	}
		

	

	public static int diasDelMes(int mes, int anio) {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		if (mes == 2 && bisiesto(anio)) {
			return 29;
		} else if (mes == 2 && !bisiesto(anio)) {
			return 28;
		} else {
			return 31;
		}

	}
}
