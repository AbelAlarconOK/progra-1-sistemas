package ejerciciosParciales;


public class NodoInt {
	int elemento;
	NodoInt siguiente;
	
	public void enlazarSiguienteNodo(NodoInt n) {
		siguiente=n;
	}
	
	public void imprimir() {
		System.out.println(elemento);
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public NodoInt getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoInt siguiente) {
		this.siguiente = siguiente;
	}
	

}
