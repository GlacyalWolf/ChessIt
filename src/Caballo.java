public class Caballo extends Ficha{

    String nombre;
    boolean isAlive;

    protected Caballo(){
        nombre = "C";
        isAlive = true;
    }

    void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    protected void posibleMovimiento(int x,int y, Board board){

        int y1=y+2;
        int x1=x-1;

        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        x1=x+1;
        y1=y+2;

        if((x1<7 && x1>0) && (y1<7 && y1>0)  ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        x1=x-1;
        y1=y-2;

        if((x1<7 && x1>0) && (y1<7 && y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        x1=x+2;
        y1=y-1;

        if((x1<7 && x1>0) && (y1<7 && y1>0)  ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        x1=x+2;
        y1=y+1;

        if((x1<7 && x1>0) && (y1<7 && y1>0)  ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        x1=x-2;
        y1=y-1;

        if((x1<7 && x1>0) && (y1<7 && y1>0)  ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        x1=x-2;
        y1=y+1;

        if((x1<7 && x1>0) && (y1<7 && y1>0)  ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
    }
}
