public class Alfil extends  {
    private int x;
    private int y;
    private boolean color;

    static int posibilidades(int x,int y){
        int y1=y;
        int x1=x;
        int mov=0;

        while(y1<7 && x1<7){
            mov++;
            y1++;
            x1++;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
        }
        y1=y;
        x1=x;
        while(y1<7 && x1>0){
            mov++;
            y1--;
            x1--;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
        }

        y1=y;
        x1=x;

        while(x1>0 && y1<7){
            mov++;
            x1--;
            y1++;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
        }

        y1=y;
        x1=x;
        while(x1<7 && y1>0){
            mov++;
            x1++;
            y1--;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
        }
        return mov;
    }

}
