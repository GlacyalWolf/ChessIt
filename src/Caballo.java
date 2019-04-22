public class Caballo {
    private int x;
    private int y;
    private boolean color;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    static int posibilidades(int x, int y){
        int y1=y;
        int x1=x;
        int mov=0;
        int countPosicion=0;


        x1--;
        y1=y1+2;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }


        x1=x;
        y1=y;

        x++;
        y1=y1+2;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }

        x1=x;
        y1=y;

        x--;
        y1=y1-2;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }

        x1=x;
        y1=y;

        x1=x1+2;
        y1--;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }

        x1=x;
        y1=y;

        x1=x1+2;
        y1++;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }

        x1=x;
        y1=y;

        x1=x1-2;
        y1--;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }

        x1=x;
        y1=y;

        x1=x1-2;
        y1++;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){
            mov++;
            /*String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);*/
        }

        return mov;
    }
    static int[] posibleMovimiento(int x,int y){
        int mov=posibilidades(x,y);
        int listaMov[]=new int[mov];
        int y1=y;
        int x1=x;
        int countPosicion=-1;
        x1--;
        y1=y1+2;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }


        x1=x;
        y1=y;

        x++;
        y1=y1+2;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        x1=x;
        y1=y;

        x--;
        y1=y1-2;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        x1=x;
        y1=y;

        x1=x1+2;
        y1--;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        x1=x;
        y1=y;

        x1=x1+2;
        y1++;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        x1=x;
        y1=y;

        x1=x1-2;
        y1--;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        x1=x;
        y1=y;

        x1=x1-2;
        y1++;
        if((x1>7 || x1<0) && (y1>7 || y1<0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }
        return listaMov;
    }
}
