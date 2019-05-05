class Ficha{

    Ficha() {
        rowNum = 0;
        numCol = 0;
        isAlive = true;
        id = "p";
        jugador = 1;
    }

    private int rowNum;
    private int numCol;
    private String id;
    private int jugador;
    private boolean isAlive;
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
    void seePossibleMoving(String id, int x, int y, Board board) {
        if (id.equalsIgnoreCase("PB")){
            peones[1].posibleMovimiento(x, y, "BLANCO", board);
        }
        if (id.equalsIgnoreCase("PN")){
            peones[1].posibleMovimiento(x, y, "NEGRO", board);
        }
        if (id.equalsIgnoreCase("T")){
            torres[1].posibleMovimiento(x, y, board);
        }
        if (id.equalsIgnoreCase("C")){
            caballos[1].posibleMovimiento(x, y, board);
        }
        if (id.equalsIgnoreCase("A")){
            alfiles[1].posibleMovimiento(x, y, board);
        }
        if (id.equalsIgnoreCase("D")){
            reinas[1].posibleMovimiento(x, y, board);
        }
        if (id.equalsIgnoreCase("R")){
            reyes[1].posibleMovimiento(x, y, board);
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
    int getJugador() {
        return jugador;
    }

    String getNombre(int numCol, int numRow) {
        for (int i = 0, x = 0; i < 8; i++, x = x + 2) {
            if (peones[x].getNumCol() == numCol && peones[x].getRowNum() == numRow) {
                return peones[x].nombre;
            }
        }
        for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
            if (torres[x].getNumCol() == numCol && torres[x].getRowNum() == numRow) {
                return torres[x].nombre;
            }
        }
        for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
            if (caballos[x].getNumCol() == numCol && caballos[x].getRowNum() == numRow) {
                return caballos[x].nombre;
            }
        }
        for (int i = 0, x = 0; i < 2; i++, x = x + 2) {
            if (alfiles[x].getNumCol() == numCol && alfiles[x].getRowNum() == numRow) {
                return alfiles[x].nombre;
            }
        }
        if (reinas[0].getNumCol() == numCol && reinas[0].getRowNum() == numRow) {
            return reinas[0].nombre;
        }
        if (reyes[0].getNumCol() == numCol && reyes[0].getRowNum() == numRow) {
            return reyes[0].nombre;
        }
        return null;
    }
}

