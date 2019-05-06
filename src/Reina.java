public class Reina extends Ficha {
    String nombre;
    boolean isAlive;

    Reina(){
        nombre = "D";
        isAlive = true;
    }

    void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    protected void posibleMovimiento(int x, int y, Board board) {
        int y1 = y;
        int x1 = x;

        while(y1<7 && x1<7){
            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            y1 = y;
            x1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        y1=y;
        x1=x;

        while(y1>0 && x1>0){
            y1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            y1 = y;
            x1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            y--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        y1=y;
        x1=x;

        while(x1>0 && y1<7){
            x1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            x1=x;
            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            x--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        y1=y;
        x1=x;

        while(x1<7 && y1>0){
            x1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            x1=x;
            y1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            x++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

    }
}