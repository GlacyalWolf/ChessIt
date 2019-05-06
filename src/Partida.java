import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Partida {

    private boolean isPartida;

    Partida() {
        isPartida = true;
    }

    private Ficha ficha = new Ficha();
    private Board tablero = new Board();

    void inicializeAll() {
        ficha.createAllPiezas();
        for (int i = 0, x = 0, y = 1; i < 8; i++, x = x + 2, y = y + 2) {
            ficha.peones[x].setNumCol(i);
            ficha.peones[x].setRowNum(6);
            ficha.peones[x].nombre = ficha.peones[x].nombre + "B";
            ficha.peones[x].setId("PB");
            ficha.peones[x].setJugador(1);
            ficha.peones[y].setNumCol(i);
            ficha.peones[y].setRowNum(1);
            ficha.peones[y].nombre = ficha.peones[y].nombre + "N";
            ficha.peones[y].setId("PN");
            ficha.peones[y].setJugador(2);
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (x == 0) {
                ficha.torres[x].setNumCol(0);
            } else {
                ficha.torres[x].setNumCol(7);
            }
            ficha.torres[x].setRowNum(7);
            ficha.torres[x].nombre = ficha.torres[x].nombre + "B";
            ficha.torres[x].setId("T");
            ficha.torres[x].setJugador(1);
            if (y == 1) {
                ficha.torres[y].setNumCol(0);
            } else {
                ficha.torres[y].setNumCol(7);
            }
            ficha.torres[y].setRowNum(0);
            ficha.torres[y].nombre = ficha.torres[y].nombre + "N";
            ficha.torres[y].setId("T");
            ficha.torres[y].setJugador(2);
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (x == 0) {
                ficha.caballos[x].setNumCol(1);
            } else {
                ficha.caballos[x].setNumCol(6);
            }
            ficha.caballos[x].setRowNum(7);
            ficha.caballos[x].nombre = ficha.caballos[y].nombre + "B";
            ficha.caballos[x].setId("C");
            ficha.caballos[x].setJugador(1);
            if (y == 1) {
                ficha.caballos[y].setNumCol(1);
            } else {
                ficha.caballos[y].setNumCol(6);
            }
            ficha.caballos[y].setRowNum(0);
            ficha.caballos[y].nombre = ficha.caballos[y].nombre + "N";
            ficha.caballos[y].setId("C");
            ficha.caballos[y].setJugador(2);
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++) {
            if (x == 0) {
                ficha.alfiles[x].setNumCol(2);
            } else {
                ficha.alfiles[x].setNumCol(5);
            }
            ficha.alfiles[x].setRowNum(7);
            ficha.alfiles[x].nombre = ficha.alfiles[x].nombre + "B";
            ficha.alfiles[x].setId("A");
            ficha.alfiles[x].setJugador(1);
            x = x + 2;
            if (y == 1) {
                ficha.alfiles[y].setNumCol(2);
            } else {
                ficha.alfiles[y].setNumCol(5);
            }
            ficha.alfiles[y].setRowNum(0);
            ficha.alfiles[y].nombre = ficha.alfiles[y].nombre + "N";
            ficha.alfiles[y].setId("A");
            ficha.alfiles[y].setJugador(2);
            y = y + 2;
        }
        ficha.reinas[0].setNumCol(3);
        ficha.reinas[0].setRowNum(7);
        ficha.reinas[0].nombre = ficha.reinas[0].nombre + "B";
        ficha.reinas[0].setId("D");
        ficha.reinas[0].setJugador(1);
        ficha.reinas[1].setNumCol(3);
        ficha.reinas[1].setRowNum(0);
        ficha.reinas[1].nombre = ficha.reinas[1].nombre + "N";
        ficha.reinas[1].setId("D");
        ficha.reinas[1].setJugador(2);
        ficha.reyes[0].setNumCol(4);
        ficha.reyes[0].setRowNum(7);
        ficha.reyes[0].nombre = ficha.reyes[0].nombre + "B";
        ficha.reyes[0].setId("R");
        ficha.reyes[0].setJugador(1);
        ficha.reyes[1].setNumCol(4);
        ficha.reyes[1].setRowNum(0);
        ficha.reyes[1].nombre = ficha.reyes[1].nombre + "N";
        ficha.reyes[1].setId("R");
        ficha.reyes[1].setJugador(2);
    }

    public void startPartida() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (isPartida == true) {
            inicializeAll();
            tablero.printBoard(ficha);
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
            // Ver si posicion de blancas es valido
            String id = findIdForPiecesPlayer1(numCol, numRow, ficha);
            ficha.seePossibleMoving(numCol, numRow, tablero);
        }
    }
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    protected String esNumeroValido(String movimiento) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean esNumero = isNumeric(movimiento);
        while (esNumero == false){
            System.out.println("Los datos introducidos no son validos, vuelvalo a introducir");
            movimiento = br.readLine();
            while (movimiento.length() < 2 || movimiento.length() > 2) {
                System.out.println("Coloca una posicion correcta");
                movimiento = br.readLine();
            }
            esNumero = isNumeric(movimiento);
        }
        int numero = Integer.parseInt(movimiento);
        String opcion;
        int numCol = numero / 10;
        int numRow = numero % 10;
        while (numCol < 0 || numCol > 7) {
            System.out.println("El numero de columna no es correcto, vuelvelo a introducir");
            opcion = br.readLine();
            esNumero = isNumeric(opcion);
            while (esNumero == false){
                System.out.println("No has introducido un numero, por favor, introduzca uno");
                opcion = br.readLine();
                while (opcion.length() < 1 || opcion.length() > 1) {
                    System.out.println("Coloca una posicion correcta");
                    opcion = br.readLine();
                }
            }
            numCol = Integer.parseInt(opcion);
        }
        while (numRow < 0 || numRow > 7) {
            System.out.println("El numero de fila no es correcto, vuelvelo a introducir");
            opcion = br.readLine();
            esNumero = isNumeric(opcion);
            while (esNumero == false){
                System.out.println("No has introducido un numero, por favor, introduzca uno");
                opcion = br.readLine();
                while (opcion.length() < 1 || opcion.length() > 1) {
                    System.out.println("Coloca una posicion correcta");
                    opcion = br.readLine();
                }
            }
            numRow = Integer.parseInt(opcion);
        }
        movimiento = String.valueOf(numCol) + String.valueOf(numRow);
        return movimiento;
    }

    protected int[] comprobarPosicion(int numCol, int numRow, Board tablero, Ficha ficha) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] posiciones = new int[2];
        while(!tablero.getIsOcupied(numCol, numRow) && ficha.getJugador() == 1) {
            System.out.println("La posicion no corresponde a ninguna de tus casillas, vuelve a introducir otra");
            String movimiento = br.readLine();
            while (movimiento.length() != 2) {
                System.out.println("Coloca una posicion correcta");
                movimiento = br.readLine();
            }
            movimiento = esNumeroValido(movimiento);
            int numero = Integer.parseInt(movimiento);
            numCol = numero / 10;
            numRow = numero % 10;
        }
        posiciones[0] = numCol;
        posiciones[1] = numRow;
        return posiciones;
    }

    protected String findIdForPiecesPlayer1(int numCol, int numRow, Ficha ficha) {
        for (int i = 0, x = 0, y = 1; i < 8; i++, x = x + 2, y = y + 2) {
            if (ficha.peones[x].getNumCol() == numCol && ficha.peones[x].getRowNum() == numRow) {
                return ficha.peones[x].getId();
            }
            if (ficha.peones[y].getNumCol() == numCol && ficha.peones[y].getRowNum() == numRow) {
                return ficha.peones[y].getId();
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (ficha.torres[x].getNumCol() == numCol && ficha.torres[x].getRowNum() == numRow) {
                return ficha.torres[x].getId();
            }
            if (ficha.torres[y].getNumCol() == numCol && ficha.torres[y].getRowNum() == numRow) {
                return ficha.torres[y].getId();
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (ficha.caballos[x].getNumCol() == numCol && ficha.caballos[x].getRowNum() == numRow) {
                return ficha.caballos[x].getId();
            }
            if (ficha.caballos[y].getNumCol() == numCol && ficha.caballos[y].getRowNum() == numRow) {
                return ficha.caballos[y].getId();
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (ficha.alfiles[x].getNumCol() == numCol && ficha.alfiles[x].getRowNum() == numRow) {
                return ficha.alfiles[x].getId();
            }
            if (ficha.alfiles[y].getNumCol() == numCol && ficha.alfiles[y].getRowNum() == numRow) {
                return ficha.alfiles[y].getId();
            }
        }
        if (ficha.reinas[0].getNumCol() == numCol && ficha.reinas[0].getRowNum() == numRow) {
            return ficha.reinas[0].getId();
        }
        if (ficha.reinas[1].getNumCol() == numCol && ficha.reinas[1].getRowNum() == numRow) {
            return ficha.reinas[1].getId();
        }
        if (ficha.reyes[0].getNumCol() == numCol && ficha.reyes[0].getRowNum() == numRow) {
            return ficha.reyes[0].getId();
        }
        if (ficha.reyes[1].getNumCol() == numCol && ficha.reyes[1].getRowNum() == numRow) {
            return ficha.reyes[1].getId();
        }
        return null;
    }

    boolean getIsOccupied(int x, int y) {
        boolean isOccupied = tablero.getIsOcupied(x, y);
        return isOccupied;
    }

    void setPossibleMoving(int x, int y) {
        tablero.setPosibleMoving(x, y);
    }
    protected void mueveFicha(int fromX,int fromY ,int toX,int toY) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (tablero.getIsOcupied(toX,toY)==true) {
            System.out.println("Posición ocupada. Introduce fila y columna donde quieras mover la pieza");
            System.out.print("Fila: ");
            toX = Integer.parseInt(br.readLine());
            System.out.println("Columna: ");
            toY = Integer.parseInt(br.readLine());
        }


        if (tablero.getIsOcupied(toX,toY) == false) {
            tablero.setIsOcupied(false, fromX,fromY); //Cambia la posición donde estava en
            tablero.setIsOcupied(true, toX, toY);
        }
    }
}