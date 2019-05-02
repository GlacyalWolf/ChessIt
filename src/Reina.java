public class Reina extends Ficha {
    String nombre;

    Reina(){
        nombre = "D";
    }
    protected void posibleMovimiento(int x, int y) {
        int y1 = y;
        int x1 = x;


        while (y1 > 0) {

            y1--;
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            } else {
                continue;
            }
        }
        while (y1 < 7) {

            y1++;
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            } else {
                continue;
            }
        }
        while (x1 > 0) {

            x1--;
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            } else {
                continue;
            }
        }
        while (x1 < 7) {
            x1++;
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            } else {
                continue;
            }
        }

    }
}