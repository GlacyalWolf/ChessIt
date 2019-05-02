public class Caballo extends Ficha{

    String nombre;

    protected Caballo(){
        nombre = "C";
    }

    protected void posibleMovimiento(int x,int y, ){


        int y1=y;
        int x1=x;
        x1--;
        y1=y1+2;
        if((x1<7 || x1<0) && (y1<7 || y1>0) ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
        x1=x;
        y1=y;
        x++;
        y1=y1+2;
        if((x1<7 || x1<0) && (y1<7 || y1>0)  ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
        x1=x;
        y1=y;
        x--;
        y1=y1-2;
        if((x1<7 || x1<0) && (y1<7 || y1>0) ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
        x1=x;
        y1=y;
        x1=x1+2;
        y1--;
        if((x1<7 || x1<0) && (y1<7 || y1>0)  ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
        x1=x;
        y1=y;
        x1=x1+2;
        y1++;
        if((x1<7 || x1<0) && (y1<7 || y1>0)  ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
        x1=x;
        y1=y;
        x1=x1-2;
        y1--;
        if((x1<7 || x1<0) && (y1<7 || y1>0)  ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
        x1=x;
        y1=y;
        x1=x1-2;
        y1++;
        if((x1<7 || x1<0) && (y1<7 || y1>0)  ){
            if (!getIsOccupied(x1, y1)) {
                setPossibleMoving(x1, y1);
            }
        }
    }
}
