package ejerciciosParciales;

public class ListaInt {
	NodoInt primero;
	NodoInt ultimos;
	NodoInt iterador;
	int nodos;

	public ListaInt() {
		iterador = null;
		primero = null;
		ultimos = null;
		nodos = 0;
	}

	public void imprimir() {
		System.out.print("[ ");
		NodoInt n = this.primero;
		while (n != null) {
			System.out.print(n.elemento + " ");
			n = n.siguiente;
		}
		System.out.println("]");
	}

	public void comenzar() {
		this.iterador = this.primero;
	}

	public int elementoActual() {
		return this.iterador.elemento;
	}

	public boolean termino() {
		return this.iterador == null;
	}

	public void avanzar() {
		this.iterador = this.iterador.siguiente;
	}

//	public void retroceder() {
//		this.iterador=this.iterador.anterior;
//	}

	public void agregarAdelante(int x) {
		NodoInt n = this.primero;
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = x;
		if (n == null) {
			this.primero = nuevo;
		} else {
			while (n.siguiente != null) {
				n = n.siguiente;
			}
			n.siguiente = nuevo;
		}
	}

	public void agregarAdelante2(int x) {

		NodoInt nuevo = new NodoInt();
		nuevo.elemento = x;
		if (this.primero == null) {
			this.ultimos = nuevo;
		}
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
		nodos++;
	}

	public void agregarAtras(int x) {
		NodoInt n = this.primero;
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = x;
		if (n == null) {
			this.primero = nuevo;
		} else {
			while (n.siguiente != null) {
				n = n.siguiente;
			}
			n.siguiente = nuevo;
		}
	}

	public void agregarAtras2(int x) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = x;
		if (this.ultimos.siguiente == null)
			this.ultimos.siguiente = nuevo;
		this.ultimos = nuevo;
	}

	public void descomponerPares() {

		NodoInt n = this.primero;
		while (n != null) {
			if (n.elemento % 2 == 0) {
				NodoInt nuevo = new NodoInt();
				nuevo.elemento = n.elemento * 2;
				n.elemento = n.elemento / 2;
				nuevo.siguiente = n.siguiente;
				n.siguiente = nuevo;
				n = nuevo.siguiente;
			} else {
				n = n.siguiente;
			}
		}
	}

	public void quitar(int x) {
		NodoInt n = this.primero, anterior = null;
		while (n != null && n.elemento != x) {
			anterior = n;
			n = n.siguiente;
		}
		if (n != null) { // encontro el nodo
			if (anterior == null) // lo encontro en el primero
				this.primero = n.siguiente;
			else
				anterior.siguiente = n.siguiente;
		}
	}

	public void filtrarElementosEnRango(int k, int m) {
		NodoInt n = this.primero;
		// Analizo desde el 2do numero
		while (n != null && n.siguiente != null) {
			if (n.siguiente.elemento <= k || n.siguiente.elemento >= m) {
				n.siguiente = n.siguiente.siguiente;
			} else {
				n = n.siguiente;
			}
		}
		// Analizo el primero
		if (this.primero != null) {
			if (this.primero.elemento <= k || this.primero.elemento >= m) {
				this.primero = this.primero.siguiente;
			}
		}
	}

	public ListaInt extraerPares() {
		ListaInt lst = new ListaInt();
		NodoInt n = this.primero;
		while (n != null) {
			if (n.elemento % 2 == 0) {
				lst.agregarAdelante(n.elemento);
			}
			n = n.siguiente;
		}
		return lst;

	}

	public ListaInt extraerPares2() {
		NodoInt n = this.primero;
		ListaInt lst = new ListaInt();
		// Analizo desde el 2do numero
		while (n != null) {
			if (n.elemento % 2 == 0) {
				lst.agregarAdelante2(n.elemento);
			}
				n=n.siguiente;
		}
		return lst;
	}

	public NodoInt getPrimero() {
		return primero;
	}

	public void setPrimero(NodoInt primero) {
		this.primero = primero;
	}

	public NodoInt getUltimos() {
		return ultimos;
	}

	public void setUltimos(NodoInt ultimos) {
		this.ultimos = ultimos;
	}

	public int getNodos() {
		return nodos;
	}

	public void setNodos(int nodos) {
		this.nodos = nodos;
	}

}
