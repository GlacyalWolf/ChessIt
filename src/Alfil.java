public class Alfil extends Ficha {
    String nombre;

    public Alfil(){
        nombre = "A";
    }

    protected void posibleMovimiento(int x,int y){
        int y1=y;
        int x1=x;

        while(y1<7 && x1<7){
            y1++;
            x1++;
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
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
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
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
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
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
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
    }

}
