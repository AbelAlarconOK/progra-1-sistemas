package juegoAhorcado;

public class Ahorcado {
	char[] secreta;
	char[] guiones;
	int fallidos;
	
	// IREP
	// secreta.length == guiones.length
	// 0 <= fallidos <=5
	

	public Ahorcado(String palabraSecreta) {
		this.secreta = new char[palabraSecreta.length()];
		this.guiones = new char[palabraSecreta.length()];
		this.fallidos = 5;
		for (int i = 0; i < secreta.length; i++) {
			this.secreta[i] = palabraSecreta.charAt(i);
			this.guiones[i] = '_';
		}

	}


	public boolean arriesgarLetra(char letra) {
		boolean laEncontro = false;
		for (int i = 0; i < this.secreta.length; i++) {
			if (this.secreta[i] == letra) {
				laEncontro = true;
				this.guiones[i] = letra;
			}
		}
		if (!laEncontro) {
			this.fallidos--;
		}
		return laEncontro;
	}

	

	public boolean arriesgarPalabra(String palabra) {
		boolean correcta=true;
		for (int i = 0; i < palabra.length();i++) {
			this.guiones[i]=palabra.charAt(i);
		}
		for(int i =0; i<this.secreta.length;i++) {
			if(this.guiones[i]!=this.secreta[i]) {
				this.fallidos=0;
				correcta=false;
			}
		}
		return correcta;
		
	}

	public void mostrar() {
		for (int i = 0; i < this.guiones.length; i++) {
			System.out.print(this.guiones[i] + " ");
		}
		System.out.println();
		System.out.println("Intentos: " + this.fallidos);
	}

	public void mostrarPalabra() {
		for (int i = 0; i < this.secreta.length; i++) {
			System.out.print(this.secreta[i]);
		}
	}

	public boolean terminado() {
		if (this.fallidos == 0) {
			return true;
		}
		boolean noHayGuiones = true;
		for (int i = 0; i < this.guiones.length; i++) {
			if (this.guiones[i] == '_') {
				noHayGuiones = false;
			}
		}
		return noHayGuiones;
	}
	
	
	
	public boolean ganado() {
		return terminado() && this.fallidos > 0;
	}
	
	
	
	//GET AND SET
	
	public char[] getSecreta() {
		return secreta;
	}

	public void setSecreta(char[] secreta) {
		this.secreta = secreta;
	}

	public char[] getGuiones() {
		return guiones;
	}

	public void setGuiones(char[] guiones) {
		this.guiones = guiones;
	}

	public int getFallidos() {
		return fallidos;
	}

	public void setFallidos(int fallidos) {
		this.fallidos = fallidos;
	}

}
