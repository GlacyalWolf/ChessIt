

public class Ficha {
    protected int rowNum;
    protected int numCol;
    protected boolean isAlive;
    protected Ficha piezas[];
    Ficha() {
        isAlive = true;
    }

    private Ficha[] createAllPiezas(Ficha piezas[]){

        for (int i = 0; i<32; i++){
            if(i<16){
                piezas[i] = inicializePeon();
            }
            else if(i<20){
                piezas[i] = inicializeTorres();
            }
            else if(i<24){
                piezas[i] = inicializeCaballo();
            }
            else if(i<28){
                piezas[i] = inicializeAlfil();
            }
            else if(i<30){
                piezas[i] = inicializeQueen();
            }
            else {
                piezas[i] = inicializeKing();
            }
        }
        return piezas;
    }

    private Torre inicializeTorres(){
        Torre torres[] = new Torre[4];
        for (int i = 0; i<2; i++){
            torres[i] = new Torre();
            return torres[i];
        }
    }
}

