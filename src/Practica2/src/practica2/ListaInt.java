package practica2;

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

	public int sumar() {
		NodoInt n = this.primero;
		int suma = 0;
		while (n != null) {
			suma += n.elemento;
			n = n.siguiente;
		}
		return suma;

	}

	public double promedio() {
		int suma = sumar();
		int largo = nodos;
		double promedio = suma / largo;
		return promedio;
	}

	public int isemio(int i) {
		NodoInt n = this.primero;
		if (i == 0) {
			return this.primero.elemento;
		}
		int contador = 0;
		while (n != null && contador < i && i < largo()) {
			contador++;
			n = n.siguiente;
		}
		return n.elemento;
	}

	public int maximo() {
		if (estaVacia()) {
			return 0;
		}
		NodoInt n = this.primero;
		int maximo = this.primero.elemento;
		while (n != null) {
			if (n.elemento >= maximo) {
				maximo = n.elemento;
			}
			n = n.siguiente;
		}
		return maximo;
	}

	public boolean estaOrdenada() {
		if (estaVacia()) {
			return true;
		}
		NodoInt n = this.primero;
		while (n != null && n.siguiente != null) {
			if (n.elemento > n.siguiente.elemento) {
				return false;
			}
			n = n.siguiente;
		}
		return true;
	}

	public boolean pertenece(int x) {
		NodoInt n = this.primero;
		while (n != null) {
			if (n.elemento == x) {
				return true;
			}
			n = n.siguiente;
		}
		return false;
	}

	public boolean esSinDuplicados() {
		ListaInt nueva = new ListaInt();
		NodoInt n = this.primero;
		while (n != null && n.siguiente != null) {
			if (nueva.pertenece(n.elemento)) {
				return false;
			}
			n = n.siguiente;
		}
		return true;
	}

	public void rotarDerecha() {
		int aux = this.ultimos.elemento;
		int aux2 = this.primero.elemento;
		this.ultimos.elemento = aux2;
		this.primero.elemento = aux;
	}

	public int largo() {
		return nodos;
	}

	public boolean estaVacia() {
		return nodos == 0;
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
		while (n != null && n.siguiente != null) {
			if (n.elemento % 2 != 0) {
				n = n.siguiente.siguiente;

			} else {
				n = n.siguiente;
			}
		}
		return lst;
	}

	public void acomodarBandera() {
		NodoInt n = primero;
		int uno = 0;
		int dos = 0;
		int tres = 0;
		while (n != null) {
			if (n.elemento == 1) {
				uno++;
			}
			if (n.elemento == 2) {
				dos++;
			}
			if (n.elemento == 3) {
				tres++;
			}
			n = n.siguiente;
		}
		n = primero;
		while (n != null) {
			if (uno > 0) {
				n.elemento = 1;
				uno--;
			} else if (dos > 0) {
				n.elemento = 2;
				dos--;
			} else if (tres > 0) {
				n.elemento = 3;
				tres--;
			}
			n = n.siguiente;
		}
	}

	public void duplicarReflejado() {
		NodoInt n = primero;
		ListaInt lst = new ListaInt();
		while (n != null) {
			lst.agregarAdelante2(n.elemento);
			n = n.siguiente;
		}
		n=primero;
		while(n!=null) {
			lst.agregarAtras2(n.elemento);
			n=n.siguiente;
		}
		primero=lst.primero;
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
