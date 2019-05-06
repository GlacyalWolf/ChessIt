public class Torre extends Ficha{

    String nombre;
    boolean isAlive;

    Torre(){
        nombre = "T";
        isAlive = true;
    }

    void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    protected void posibleMovimiento(int x,int y, Board board){
        int y1=y;
        int x1=x;

        while(y1>0) {

            y1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(y1<7){

            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(x1>0){

            x1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(x1<7){
            x1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(y1<7 && x1<7){
            y1++;
            x1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }

        y1=y;
        x1=x;

        while(y1<7 && x1>0){
            y1--;
            x1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }

        y1=y;
        x1=x;

        while(x1>0 && y1<7){
            x1--;
            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }

        y1=y;
        x1=x;
        while(x1<7 && y1>0){
            x1++;
            y1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
    }
}


