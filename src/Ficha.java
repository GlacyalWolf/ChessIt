class Ficha{

    Ficha() {
        rowNum = 0;
        numCol = 0;
        id = "p";
        jugador = 1;
    }

    private int rowNum;
    private int numCol;
    private String id;
    private int jugador;
    Peon[] peones;
    Torre[] torres;
    Caballo[] caballos;
    Alfil[] alfiles;
    Reina[] reinas;
    Rey[] reyes;


    void createAllPiezas(){
        peones = new Peon[16];
        torres = new Torre[4];
        caballos = new Caballo[4];
        alfiles = new Alfil[4];
        reinas = new Reina[2];
        reyes = new Rey[2];
        for (int i = 0; i<16; i++) {
            peones[i]=new Peon();
        }
        for (int i = 0; i<4; i++) {
            torres[i]=new Torre();
        }
        for (int i = 0; i<4; i++) {
            caballos[i]=new Caballo();
        }
        for (int i = 0; i<4; i++) {
            alfiles[i]=new Alfil();
        }
        for (int i = 0; i<2; i++) {
            reinas[i]=new Reina();
        }
        for (int i = 0; i<2; i++) {
            reyes[i]=new Rey();
        }
    }
    void seePossibleMoving(int numCol, int numRow, Board board) {
        for (int i = 0, x = 0, y=1; i < 8; i++, x = x + 2, y = y + 2) {
            if (peones[x].getNumCol() == numCol && peones[x].getRowNum() == numRow) {
                peones[x].posibleMovimiento(numCol, numRow, "blanco", board);
            }
            if (peones[y].getNumCol() == numCol && peones[y].getRowNum() == numRow) {
                peones[y].posibleMovimiento(numCol, numRow, "negro", board);;
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (torres[x].getNumCol() == numCol && torres[x].getRowNum() == numRow) {
                torres[x].posibleMovimiento(numCol, numRow, board);
            }
            if (torres[y].getNumCol() == numCol && torres[y].getRowNum() == numRow) {
                torres[y].posibleMovimiento(numCol, numRow, board);
            }
        }
        for (int i = 0, x = 0, y = 0; i < 2; i++, x = x + 2, y = y + 2) {
            if (caballos[x].getNumCol() == numCol && caballos[x].getRowNum() == numRow) {
                caballos[x].posibleMovimiento(numCol, numRow, board);
            }
            if (caballos[y].getNumCol() == numCol && caballos[y].getRowNum() == numRow) {
                caballos[y].posibleMovimiento(numCol, numRow, board);
            }
        }
        for (int i = 0, x = 0, y = 0; i < 2; i++, x = x + 2, y = y + 2) {
            if (alfiles[x].getNumCol() == numCol && alfiles[x].getRowNum() == numRow) {
                alfiles[x].posibleMovimiento(numCol, numRow, board);
            }
            if (alfiles[y].getNumCol() == numCol && alfiles[y].getRowNum() == numRow) {
                alfiles[y].posibleMovimiento(numCol, numRow, board);
            }
        }
        if (reinas[0].getNumCol() == numCol && reinas[0].getRowNum() == numRow) {
            reinas[0].posibleMovimiento(numCol, numRow, board);
        }
        if (reinas[1].getNumCol() == numCol && reinas[1].getRowNum() == numRow) {
            reinas[1].posibleMovimiento(numCol, numRow, board);
        }
        if (reyes[0].getNumCol() == numCol && reyes[0].getRowNum() == numRow) {
            reyes[0].posibleMovimiento(numCol, numRow, board);
        }
        if (reyes[1].getNumCol() == numCol && reyes[1].getRowNum() == numRow) {
            reyes[1].posibleMovimiento(numCol, numRow, board);
        }
    }
    void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }
    int getRowNum() {
        return rowNum;
    }
    void setNumCol(int numCol) {
        this.numCol = numCol;
    }
    int getNumCol() {
        return numCol;
    }
    void setJugador(int jugador) {
        this.jugador = jugador;
    }
    void setId(String id) {
        this.id = id;
    }
    String getId() {
        return id;
    }
    boolean getIsAlive(int numCol, int numRow){
        for (int i = 0, x = 0, y=1; i < 8; i++, x = x + 2, y = y + 2) {
            if (peones[x].getNumCol() == numCol && peones[x].getRowNum() == numRow) {
                return peones[x].isAlive;
            }
            if (peones[y].getNumCol() == numCol && peones[y].getRowNum() == numRow) {
                return peones[y].isAlive;
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (torres[x].getNumCol() == numCol && torres[x].getRowNum() == numRow) {
                return torres[x].isAlive;
            }
            if (torres[y].getNumCol() == numCol && torres[y].getRowNum() == numRow) {
                return torres[y].isAlive;
            }
        }
        for (int i = 0, x = 0, y = 0; i < 2; i++, x = x + 2, y = y + 2) {
            if (caballos[x].getNumCol() == numCol && caballos[x].getRowNum() == numRow) {
                return caballos[x].isAlive;
            }
            if (caballos[y].getNumCol() == numCol && caballos[y].getRowNum() == numRow) {
                return caballos[y].isAlive;
            }
        }
        for (int i = 0, x = 0, y = 0; i < 2; i++, x = x + 2, y = y + 2) {
            if (alfiles[x].getNumCol() == numCol && alfiles[x].getRowNum() == numRow) {
                return alfiles[x].isAlive;
            }
            if (alfiles[y].getNumCol() == numCol && alfiles[y].getRowNum() == numRow) {
                return alfiles[y].isAlive;
            }
        }
        if (reinas[0].getNumCol() == numCol && reinas[0].getRowNum() == numRow) {
            return reinas[0].isAlive;
        }
        if (reinas[1].getNumCol() == numCol && reinas[1].getRowNum() == numRow) {
            return reinas[1].isAlive;
        }
        if (reyes[0].getNumCol() == numCol && reyes[0].getRowNum() == numRow) {
            return reyes[0].isAlive;
        }
        if (reyes[1].getNumCol() == numCol && reyes[1].getRowNum() == numRow) {
            return reyes[1].isAlive;
        }
        return true;
    }
    int getJugador() {
        return jugador;
    }

    void setIsAlive(boolean isAlive, int numCol, int numRow){
        for (int i = 0, x = 0, y=1; i < 8; i++, x = x + 2, y = y + 2) {
            if (peones[x].getNumCol() == numCol && peones[x].getRowNum() == numRow) {
                peones[x].setIsAlive(isAlive);
            }
            if (peones[y].getNumCol() == numCol && peones[y].getRowNum() == numRow) {
                peones[y].setIsAlive(isAlive);
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (torres[x].getNumCol() == numCol && torres[x].getRowNum() == numRow) {
                torres[x].setIsAlive(isAlive);
            }
            if (torres[y].getNumCol() == numCol && torres[y].getRowNum() == numRow) {
                torres[y].setIsAlive(isAlive);
            }
        }
        for (int i = 0, x = 0, y = 0; i < 2; i++, x = x + 2, y = y + 2) {
            if (caballos[x].getNumCol() == numCol && caballos[x].getRowNum() == numRow) {
                caballos[x].setIsAlive(isAlive);
            }
            if (caballos[y].getNumCol() == numCol && caballos[y].getRowNum() == numRow) {
                caballos[y].setIsAlive(isAlive);
            }
        }
        for (int i = 0, x = 0, y = 0; i < 2; i++, x = x + 2, y = y + 2) {
            if (alfiles[x].getNumCol() == numCol && alfiles[x].getRowNum() == numRow) {
                alfiles[x].setIsAlive(isAlive);
            }
            if (alfiles[y].getNumCol() == numCol && alfiles[y].getRowNum() == numRow) {
                alfiles[y].setIsAlive(isAlive);
            }
        }
        if (reinas[0].getNumCol() == numCol && reinas[0].getRowNum() == numRow) {
            reinas[0].setIsAlive(isAlive);
        }
        if (reinas[1].getNumCol() == numCol && reinas[1].getRowNum() == numRow) {
            reinas[1].setIsAlive(isAlive);
        }
        if (reyes[0].getNumCol() == numCol && reyes[0].getRowNum() == numRow) {
            reyes[0].setIsAlive(isAlive);
        }
        if (reyes[1].getNumCol() == numCol && reyes[1].getRowNum() == numRow) {
            reyes[1].setIsAlive(isAlive);
        }
    }

    String getNombre(int numCol, int numRow) {
        for (int i = 0, x = 0, y=1; i < 8; i++, x = x + 2, y = y + 2) {
            if (peones[x].getNumCol() == numCol && peones[x].getRowNum() == numRow) {
                return peones[x].nombre;
            }
            if (peones[y].getNumCol() == numCol && peones[y].getRowNum() == numRow) {
                return peones[y].nombre;
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (torres[x].getNumCol() == numCol && torres[x].getRowNum() == numRow) {
                return torres[x].nombre;
            }
            if (torres[y].getNumCol() == numCol && torres[y].getRowNum() == numRow) {
                return torres[y].nombre;
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (caballos[x].getNumCol() == numCol && caballos[x].getRowNum() == numRow) {
                return caballos[x].nombre;
            }
            if (caballos[y].getNumCol() == numCol && caballos[y].getRowNum() == numRow) {
                return caballos[y].nombre;
            }
        }
        for (int i = 0, x = 0, y = 1; i < 2; i++, x = x + 2, y = y + 2) {
            if (alfiles[x].getNumCol() == numCol && alfiles[x].getRowNum() == numRow) {
                return alfiles[x].nombre;
            }
            if (alfiles[y].getNumCol() == numCol && alfiles[y].getRowNum() == numRow) {
                return alfiles[y].nombre;
            }
        }
        if (reinas[0].getNumCol() == numCol && reinas[0].getRowNum() == numRow) {
            return reinas[0].nombre;
        }
        if (reinas[1].getNumCol() == numCol && reinas[1].getRowNum() == numRow) {
            return reinas[1].nombre;
        }
        if (reyes[0].getNumCol() == numCol && reyes[0].getRowNum() == numRow) {
            return reyes[0].nombre;
        }
        if (reyes[1].getNumCol() == numCol && reyes[1].getRowNum() == numRow) {
            return reyes[1].nombre;
        }
        return null;
    }
}

