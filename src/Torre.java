public class Torre{
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


    static int posibilidades(int x,int y){
        int y1=y;
        int x1=x;
        int mov=0;

        while(y1>0){
            mov++;
            y1--;
        }
        y1=y;
        while(y1<7){
            mov++;
            y1++;
        }

        while(x1>0){
            mov++;
            x1--;
        }
        x1=x;
        while(x1<7){
            mov++;
            x1++;
        }
        return mov;
    }


    static int[] posibleMovimiento(int x,int y){
        int mov=posibilidades(x,y);
        int listaMov[]=new int[mov];
        int y1=y;
        int x1=x;
        int countPosicion=-1;

        while(y1>0){
            countPosicion++;
            y1--;
            String sX = String.valueOf(x);
            String sY1 = String.valueOf(y1);
            String con = sX + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }
        y1=y;
        while(y1<7){
            countPosicion++;
            y1++;
            String sX = String.valueOf(x);
            String sY1 = String.valueOf(y1);
            String con = sX + sY1;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        while(x1>0){
            countPosicion++;
            x1--;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }
        x1=x;
        while(x1<7){
            countPosicion++;
            x1++;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
            listaMov[countPosicion]=(resultado);
        }

        return listaMov;
    }
}


