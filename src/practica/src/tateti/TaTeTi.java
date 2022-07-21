package tateti;

public class TaTeTi {


	// Variables de instancia
	private char tablero[][];
	private char turno;
	private boolean terminado;
	private char ganador;

	/**
	 * Construye un juego de TaTeTi.
	 */
	public TaTeTi() {
		tablero = new char[3][3];
		turno = 'x';
		ganador = ' ';
		terminado = false;

		for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 3; ++j)
				tablero[i][j] = ' ';
	}

	public char getTurno() {
		return turno;
	}

	/**
	 * Muestra el tablero por la consola de Java.
	 */
	public void mostrar() {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j)
				System.out.print((tablero[i][j] == ' ' ? '_' : tablero[i][j]) + "  ");

			System.out.println();
		}

		System.out.println();
	}

	/**
	 * Retorna un char especificando a qu� jugador le corresponde el pr�ximo turno
	 * del juego.
	 */
	public char proximoTurno() {
		return turno;
	}

	/**
	 * Realiza una jugada sobre el tablero en la posici�n especificada. La jugada
	 * corresponde al jugador indicado por proximoTurno(). Se produce una excepci�n
	 * si la jugada es inv�lida.
	 */
	public void jugar(int fila, int columna) {
		if (fila < 1 || fila > 3 || columna < 1 || columna > 3)
			throw new RuntimeException("Error! Las posici�n (" + fila + "," + columna + ") est� fuera del tablero. ");

		if (contenido(fila, columna) != ' ')
			throw new RuntimeException("Error! Se intent� jugar en una posici�n no vac�a. ");

		if (terminado() == true)
			throw new RuntimeException("Error! Se intent� jugar pero el juego ya termin�. ");

		tablero[fila - 1][columna - 1] = turno;

		verificarTerminado();

		if (!terminado())
			turno = turno == 'x' ? 'o' : 'x';
	}

	/**
	 * Devuelve el contenido de la posici�n indicada.
	 */
	public char contenido(int fila, int columna) {
		return tablero[fila - 1][columna - 1];
	}

	/**
	 * Indica si el juego est� terminado. Esto puede ser o bien porque alg�n jugador
	 * ya gan� o bien porque no quedan espacios donde jugar.
	 */
	public boolean terminado() {
		return terminado;
	}

	/**
	 * Verifica si alguien gan� y setea el ganador. Tambi�n verifica si hay empate.
	 */
	private void verificarTerminado() {
		// Verifica cada una de las filas
		for (int i = 0; i < 3; ++i) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][2] != ' ') {
				ganador = tablero[i][0];
				terminado = true;
			}
		}

		// Verifica cada una de las columnas
		for (int j = 0; j < 3; ++j) {
			if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j] && tablero[2][j] != ' ') {
				ganador = tablero[0][j];
				terminado = true;
			}
		}

		// Verifica la diagonal
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[2][2] != ' ') {
			ganador = tablero[0][0];
			terminado = true;
		}

		// Verifica la otra diagonal
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[2][0] != ' ') {
			ganador = tablero[0][2];
			terminado = true;
		}

		if (terminado)
			return;

		// Verifica si quedan espacios vac�os
		int cont = 0;
		for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 3; ++j)
				if (tablero[i][j] == ' ')
					++cont;

		if (cont == 0) {
			ganador = ' ';
			terminado = true;
		}
	}

	/**
	 * Si el juego termin�, indica qui�n fue el ganador, si no lanza una excepci�n.
	 */
	public char ganador() {
		if (terminado() == false)
			throw new RuntimeException("Error! Se consult� el ganador de un juego que no est� terminado.");

		return ganador;
	}
}

