import sun.reflect.generics.visitor.Reifier;

public class Ficha {
    protected int rowNum;
    protected int numCol;
    protected boolean isAlive;
    protected Peon peones[];
    protected Torre torres[];
    protected Caballo caballos[];
    protected Alfil alfiles[];
    protected Reina reinas[];
    protected Rey reyes[];
    protected Board board;
    Ficha() {
        isAlive = true;
        board = new Board();
    }

    private void createAllPiezas(Ficha piezas[]){

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
    public void seePossibleMoving(String nombre, int x, int y) {
        if (nombre.equals("PB")){

        }
    }
    protected Peon getPeones(int x){
        return peones[x];
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }
    public void setNombrePeonJugador1(int i){
        peones[i].nombre = peones[i].nombre + "B";
    }
    public void setNombrePeonJugador2(int x){
        peones[x].nombre = peones[x].nombre + "N";
    }
    public void setNombreTorreJugador1(int i){
        torres[i].nombre = torres[i].nombre + "B";
    }
    public void setNombreTorreJugador2(int x){
        torres[x].nombre = torres[x].nombre + "N";
    }
    public void setNombreCaballoJugador1(int i){
        caballos[i].nombre = caballos[i].nombre + "B";
    }
    public void setNombreCaballoJugador2(int x){
        caballos[x].nombre = caballos[x].nombre + "N";
    }
    public void setNombreAlfilJugador1(int i){
        alfiles[i].nombre = alfiles[i].nombre + "B";
    }
    public void setNombreAlfilJugador2(int x){
        alfiles[x].nombre = alfiles[x].nombre + "N";
    }
    public void setNombreReinaJugador1(int i){
        reinas[i].nombre = reinas[i].nombre + "B";
    }
    public void setNombreReinaJugador2(int x){
        reinas[x].nombre = reinas[x].nombre + "N";
    }
    public void setNombreReyJugador1(int i){
        reyes[i].nombre = reyes[i].nombre + "B";
    }
    public void setNombreReyJugador2(int x){
        reyes[x].nombre = reyes[x].nombre + "N";
    }
}

