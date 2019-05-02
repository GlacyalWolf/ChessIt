public class Torre extends Ficha{

    String nombre;

    Torre(){
        nombre = "T";
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


