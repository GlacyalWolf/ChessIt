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

    void posibleMovimiento(int x,int y, Board board) {

        int y1 = y;
        int x1 = x;

        while (y1 > 0) {

            y1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        while (y1 < 7) {

            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        while (x1 > 0) {

            x1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        while (x1 < 7) {
            x1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
    }
}


