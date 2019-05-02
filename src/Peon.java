public class Peon extends Ficha{

    String nombre;
    boolean posicionInicial;

    public Peon(){
        nombre = "P";
        posicionInicial = true;
    }

    protected void posibleMovimiento(int x,int y, String color, Board board){
        int y1=y;
        int x1=x;

        if (color.equalsIgnoreCase("blanco") && posicionInicial){
            y1=y1-2;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        if ((color.equalsIgnoreCase("negro") && posicionInicial)){
            y1=y1+2;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }

        if (color.equalsIgnoreCase("blanco")){
            y1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }

            x1++;
            /** coger cordenadas **/
            if((x1<7 || x1>0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }
            x1=x;
            x1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }

        }
        else{
            y1++;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }

            x1++;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }
            x1=x;
            x1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }
        }
    }
}
