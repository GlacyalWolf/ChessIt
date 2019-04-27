public class Rey extends Ficha{

    String nombre;

    // ♥
    Rey(){
        nombre = "R";
    }

    private void posibleMovimiento(int x,int y){
        int y1 = y;
        int x1 = x;
        int mov = 0;
        boolean jaque;
        int countPosicion=-1;

        y++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        x++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        y--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        y--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        x--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        x--;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        y++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }
        y++;
        if((x1<7 || x1>0) && (y1<7 || y1>0) ){

            countPosicion++;
            String sX1 = String.valueOf(x1);
            String sY1 = String.valueOf(y1);
            String con = sX1 + sY1;
            int resultado = Integer.parseInt(con);
        }

    }

}
