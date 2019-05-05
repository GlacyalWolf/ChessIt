import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Partida{

	private boolean isPartida;

	Partida(){
		isPartida = true;
	}

	private Ficha ficha = new Ficha();
	private Board tablero = new Board();

	void inicializeAll(){
		ficha.createAllPiezas();
		for (int i = 0, x = 0, y = 1; i < 8; i++) {
			ficha.peones[x].setNumCol(setNumColJugador1FirstRowPeon());
			ficha.peones[x].setRowNum(1);
			ficha.peones[x].nombre = ficha.peones[x].nombre + "B";
			ficha.peones[x].setId("PB");
			ficha.peones[x].setJugador(1);
			x = x + 2;
			ficha.peones[y].setNumCol((setNumColJugador1SecondRowPeon()));
			ficha.peones[y].setRowNum(6);
			ficha.peones[y].nombre = ficha.peones[y].nombre + "N";
			ficha.peones[y].setId("PN");
			ficha.peones[y].setJugador(2);
			y = y + 2;
		}
		for (int i = 0, x = 0, y = 1; i < 2; i++) {
			if (x == 0) {
				ficha.torres[x].setNumCol(0);
			} else {
				ficha.torres[x].setNumCol(7);
			}
			ficha.torres[x].setRowNum(0);
			ficha.torres[x].nombre = ficha.torres[x].nombre + "B";
			ficha.torres[x].setId("T");
			ficha.torres[x].setJugador(1);
			x = x + 2;
			if (y == 1) {
				ficha.torres[y].setNumCol(0);
			} else {
				ficha.torres[y].setNumCol(7);
			}
			ficha.torres[y].setRowNum(7);
			ficha.torres[y].nombre = ficha.torres[y].nombre + "N" ;
			ficha.torres[y].setId("T");
			ficha.torres[y].setJugador(2);
			y = y + 2;
		}
		for (int i = 0, x = 0, y = 1; i < 2; i++) {
			if (x == 0) {
				ficha.caballos[x].setNumCol(1);
			} else {
				ficha.caballos[x].setNumCol(6);
			}
			ficha.caballos[x].setRowNum(0);
			ficha.caballos[x].nombre = ficha.torres[y].nombre + "B";
			ficha.caballos[x].setId("C");
			ficha.caballos[x].setJugador(1);
			x = x + 2;
			if (y == 1) {
				ficha.caballos[y].setNumCol(1);
			} else {
				ficha.caballos[y].setNumCol(6);
			}
			ficha.caballos[y].setRowNum(7);
			ficha.caballos[y].nombre = ficha.caballos[y].nombre + "N";
			ficha.caballos[y].setId("C");
			ficha.caballos[y].setJugador(2);
			y = y + 2;
		}
		for (int i = 0, x = 0, y = 1; i < 2; i++) {
			if (x == 0) {
				ficha.alfiles[x].setNumCol(2);
			} else {
				ficha.torres[x].setNumCol(5);
			}
			ficha.alfiles[x].setRowNum(0);
			ficha.alfiles[x].nombre = ficha.alfiles[x].nombre + "B";
			ficha.alfiles[x].setId("A");
			ficha.alfiles[x].setJugador(1);
			x = x + 2;
			if (y == 1) {
				ficha.alfiles[y].setNumCol(2);
			} else {
				ficha.alfiles[y].setNumCol(5);
			}
			ficha.alfiles[y].setRowNum(7);
			ficha.alfiles[y].nombre = ficha.alfiles[y].nombre + "N";
			ficha.alfiles[y].setId("A");
			ficha.alfiles[y].setJugador(2);
			y = y + 2;
		}
		ficha.reinas[0].setNumCol(3);
		ficha.reinas[0].setRowNum(0);
		ficha.reinas[0].nombre = ficha.reinas[0].nombre + "B";
		ficha.reinas[0].setId("D");
		ficha.reinas[0].setJugador(1);
		ficha.reinas[1].setNumCol(3);
		ficha.reinas[1].setRowNum(7);
		ficha.reinas[1].nombre = ficha.reinas[1].nombre + "N";
		ficha.reinas[1].setId("D");
		ficha.reinas[1].setJugador(2);
		ficha.reyes[0].setNumCol(4);
		ficha.reyes[0].setRowNum(0);
		ficha.reyes[0].nombre = ficha.reyes[0].nombre + "B";
		ficha.reyes[0].setId("R");
		ficha.reyes[0].setJugador(1);
		ficha.reyes[1].setNumCol(4);
		ficha.reyes[1].setRowNum(7);
		ficha.reyes[1].nombre = ficha.reyes[1].nombre + "N";
		ficha.reyes[1].setId("R");
		ficha.reyes[1].setJugador(2);
	}

	public void startPartida() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (isPartida == true) {
			inicializeAll();
			tablero.printBoard();
			System.out.println("Turno jugador 1");
			// Seleccionar pieza
			System.out.println("Jugador 1, selecciona la casilla de la pieza que quieras mover");
			String movimiento = br.readLine();
			while (movimiento.length() < 2 || movimiento.length() > 2) {
				System.out.println("Coloca una posicion correcta");
				movimiento = br.readLine();
			}
			movimiento = esNumeroValido(movimiento);
			int numero = Integer.parseInt(movimiento);
			int numCol = numero / 10;
			int numRow = numero % 10;
			int[] movimientosList;
			movimientosList = comprobarPosicion(numCol, numRow, tablero, ficha);
			numCol = movimientosList[0];
			numRow = movimientosList[1];

			// Ver si posici�n de blancas es valido
			String id = findIdForPiecesPlayer1(numCol, numRow, ficha);
			ficha.seePossibleMoving(id, numCol, numRow, tablero);
		}

	}

	protected int setNumColJugador1FirstRowPeon() {
		int x1 = -1;
		x1++;
		return x1;
	}

	protected int setNumColJugador1SecondRowPeon() {
		int x1 = -1;
		x1++;
		return x1;
	}

	protected String esNumeroValido(String movimiento) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numero = Integer.parseInt(movimiento);
		String opcion;
		int numCol = numero / 10;
		int numRow = numero % 10;
		while (numCol < 0 || numCol > 7) {
			System.out.println("El numero de columna no es correcto, vuelvelo a introducir");
			opcion = br.readLine();
			numCol = Integer.parseInt(opcion);
		}
		while (numRow < 0 || numRow > 7) {
			System.out.println("El numero de fila no es correcto, vuelvelo a introducir");
			opcion = br.readLine();
			numRow = Integer.parseInt(opcion);
		}
		movimiento = String.valueOf(numCol) + String.valueOf(numRow);
		return movimiento;
	}

	protected int[] comprobarPosicion(int numCol, int numRow, Board tablero, Ficha ficha) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] posiciones = new int[2];
		if (tablero.getIsOcupied(numCol, numRow) && ficha.getJugador() == 1) {
			posiciones[0] = numCol;
			posiciones[1] = numRow;
			return posiciones;
		} else {
			System.out.println("La posicion no corresponde a ninguna de tus casillas, vuelve a introducir otra");
			String movimiento = br.readLine();
			while (movimiento.length() < 2 || movimiento.length() > 2) {
				System.out.println("Coloca una posicion correcta");
				movimiento = br.readLine();
			}
			movimiento = esNumeroValido(movimiento);
			int numero = Integer.parseInt(movimiento);
			numCol = numero / 10;
			numRow = numero % 10;
			comprobarPosicion(numCol, numRow, tablero, ficha);
			return null;
		}
	}

	protected String findIdForPiecesPlayer1(int numCol, int numRow, Ficha ficha) {
		for (int i = 0, x = 0; i < 8; i++, x = x + 2) {
			if (ficha.peones[x].getNumCol() == numCol && ficha.peones[x].getRowNum() == numRow) {
				return ficha.peones[x].getId();
			}
		}
		for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
			if (ficha.torres[x].getNumCol() == numCol && ficha.torres[x].getRowNum() == numRow) {
				return ficha.torres[x].getId();
			}
		}
		for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
			if (ficha.caballos[x].getNumCol() == numCol && ficha.caballos[x].getRowNum() == numRow) {
				return ficha.caballos[x].getId();
			}
		}
		for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
			if (ficha.alfiles[x].getNumCol() == numCol && ficha.alfiles[x].getRowNum() == numRow) {
				return ficha.alfiles[x].getId();
			}
		}
		if (ficha.reinas[0].getNumCol() == numCol && ficha.reinas[0].getRowNum() == numRow) {
			return ficha.reinas[0].getId();
		}
		if (ficha.reyes[0].getNumCol() == numCol && ficha.reyes[0].getRowNum() == numRow) {
			return ficha.reyes[0].getId();
		}
		return null;
	}
	boolean getIsOccupied(int x, int y){
		boolean isOccupied = tablero.getIsOcupied(x, y);
		return isOccupied;
	}
	void setPossibleMoving(int x, int y){
		tablero.setPosibleMoving(x, y);
	}
	String getNombre(int numCol, int numRow) {
		for (int i = 0, x = 0; i < 8; i++, x = x + 2) {
			if (ficha.peones[x].getNumCol() == numCol && ficha.peones[x].getRowNum() == numRow) {
				return ficha.peones[x].nombre;
			}
		}
		for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
			if (ficha.torres[x].getNumCol() == numCol && ficha.torres[x].getRowNum() == numRow) {
				return ficha.torres[x].nombre;
			}
		}
		for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
			if (ficha.caballos[x].getNumCol() == numCol && ficha.caballos[x].getRowNum() == numRow) {
				return ficha.caballos[x].nombre;
			}
		}
		for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
			if (ficha.alfiles[x].getNumCol() == numCol && ficha.alfiles[x].getRowNum() == numRow) {
				return ficha.alfiles[x].nombre;
			}
		}
		if (ficha.reinas[0].getNumCol() == numCol && ficha.reinas[0].getRowNum() == numRow) {
			return ficha.reinas[0].nombre;
		}
		if (ficha.reyes[0].getNumCol() == numCol && ficha.reyes[0].getRowNum() == numRow) {
			return ficha.reyes[0].nombre;
		}
		return null;
	}
	void JaqueMateBlancas() {
		//Creando clase para calcular el jaque mate de las piezas blancas
		for (int i = 0; i < 8; i++){
			//llamando a todos los peones negros para comprobar sus posibles movimientos
			if (ficha.peones[i].nombre == "PN"){
				//mierda seca: abajo supuestamente se deberia pillar los posibles movimientos de los peones
				getPosibleMoving();
				if (){
					//mierda seca: aqui se deberia comprobar que alguno de los posibles movimientos coincide con la posicion del rei
				}
			}
		}
		for (int i = 0; i < 2; i++){
			//llamando a todos los peones negros para comprobar sus posibles movimientos
			if (ficha.torres[i].nombre == "TN"){

				//mierda seca: abajo supuestamente se deberia pillar los posibles movimientos de las torres
				getPosibleMoving();
				if (){
					//mierda seca: aqui se deberia comprobar que alguno de los posibles movimientos coincide con la posicion del rei
				}
			}
		}
		for (int i = 0; i < 2; i++){
			if (ficha.caballos[i].nombre == "CN"){
				//mierda seca
				getPosibleMoving();
				if (){
					//mierda seca
				}
			}
		}
		for (int i = 0; i < 2; i++){
			if (ficha.alfiles[i].nombre == "AN"){
				//mierda seca
				getPosibleMoving();
				if (){
					//mierda seca
				}
			}
		}
		if (ficha.reinas[1].nombre == "RN"){
			//mierda seca
			getPosibleMoving();
			if (){
				//mierda seca
			}
		}
		if (ficha.reyes[1].nombre == "RN"){
			//mierda seca
			getPosibleMoving();
			if (){
				//mierda seca
			}
		}

	}

	void JaqueMateNegras() {
		//Creando clase para calcular el jaque mate de las piezas negras
		for (int i = 0; i < 8; i++){
			if (ficha.peones[i].nombre == "PB"){
				//mierda seca
				getPosibleMoving();
				if (){
					//mierda seca
				}
			}
		}
		for (int i = 0; i < 2; i++){
			if (ficha.torres[i].nombre == "TB"){
				//mierda seca
				getPosibleMoving();
				if (){
					//mierda seca
				}
			}
		}
		for (int i = 0; i < 2; i++){
			if (ficha.caballos[i].nombre == "CB"){
				//mierda seca
				getPosibleMoving();
				if (){
					//mierda seca
				}
			}
		}
		for (int i = 0; i < 2; i++){
			if (ficha.alfiles[i].nombre == "AB"){
				//mierda seca
				getPosibleMoving();
				if (){
					//mierda seca
				}
			}
		}
		if (ficha.reinas[1].nombre == "RB"){
			//mierda seca
			getPosibleMoving();
			if (){
				//mierda seca
			}
		}
		if (ficha.reyes[1].nombre == "RB"){
			//mierda seca
			getPosibleMoving();
			if (){
				//mierda seca
			}
		}

	}
}
	