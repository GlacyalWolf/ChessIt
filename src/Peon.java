public class Peon extends Ficha{

    String nombre;
    boolean posicionInicial;
    boolean isAlive;

    public Peon(){
        nombre = "P";
        posicionInicial = true;
        isAlive = true;
    }
    void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    protected void posibleMovimiento(int numCol,int numRow, String color, Board board){
        int x1=numCol;
        int y1=numRow;
        System.out.println(x1);
        System.out.println(y1);
        if (color.equalsIgnoreCase("blanco") && posicionInicial){
            y1=y1-2;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
        }
        if ((color.equalsIgnoreCase("negro") && posicionInicial)){
            y1=y1+2;
            if (!board.getIsOcupied(x1, y1)) {
                System.out.println(x1);
                System.out.println(y1);
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
            x1=numCol;
            x1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }

        }
        else{
            y1=numRow;
            y1++;
            System.out.println(x1);
            System.out.println(y1);
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }
            System.out.println(x1);
            System.out.println(y1);

            x1++;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                if (!board.getIsOcupied(x1, y1)) {
                    board.setPosibleMoving(x1, y1);
                }
            }
            x1=numCol;
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
