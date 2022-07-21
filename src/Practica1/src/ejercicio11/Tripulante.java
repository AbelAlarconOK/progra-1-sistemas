package ejercicio11;

public class Tripulante {
	String nombre;
	String cargo;
	int antiguedad;
	
	public Tripulante(String name, String carg, int ant) {
		nombre=name;
		cargo=carg;
		antiguedad=ant;
	}
	
	public Tripulante() {
		// TODO Auto-generated constructor stub
	}

	public boolean mismaPersona(Tripulante t1) {
		if((t1.nombre==this.nombre)&&(t1.antiguedad==this.antiguedad)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean piloto() {
		return this.cargo=="piloto";
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
}

