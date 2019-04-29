public class Rey extends Ficha{

    String nombre;
    Boolean isJaque;

    // ♥
    Rey(){
        nombre = "R";
        isJaque = false;
    }

    public void setIsJaque(boolean isJaque){
        this.isJaque = isJaque;
    }
    public boolean getIsJaque(){
        return  isJaque;
    }

    private void posibleMovimiento(int x,int y){
        int y1 = y;
        int x1 = x;
        boolean jaque;

        y++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        x++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        y--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        y--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        x--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        x--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        y++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        y++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

    }

}
