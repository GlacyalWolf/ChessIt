

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
                piezas[i] = inicializeReina();
            }
            else {
                piezas[i] = inicializeRei();
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

    private Caballo inicializeCaballo(){
        Caballo caballos[]= new Caballo[4];
        for (int i = 0; i<2; i++){
            caballos[i] = new Caballo();
            return caballos[i];
        }
    }

    private Peon inicializePeon(){
        Peon peones[]= new Peon[16];
        for (int i = 0; i<2; i++){
            peones[i] = new Peon();
            return peones[i];
        }
    }

    private Alfil inicializeAlfil(){
        Alfil alfils[]= new Alfil[4];
        for (int i = 0; i<2; i++){
            alfils[i] = new Alfil();
            return alfils[i];
        }
    }

    private Reina inicializeReina(){
        Reina reinas[]= new Reina[2];
        for (int i = 0; i<2; i++){
            reinas[i] = new Reina();
            return reinas[i];
        }
    }

    private Rei inicializeRei(){
        Rei reis[]= new Rri[2];
        for (int i = 0; i<2; i++){
            reis[i] = new Rei();
            return reis[i];
        }
    }

}

