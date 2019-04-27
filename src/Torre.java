public class Torre extends Ficha{

    String nombre;

    Torre(){
        nombre = "P";
    }

    private void posibleMovimiento(int x,int y){
        int y1=y;
        int x1=x;
        int countPosicion=-1;

        while(y1>0) {
            countPosicion++;
            y1--;
            String sX = String.valueOf(x);
            String sY1 = String.valueOf(y1);
            String con = sX + sY1;
            int resultado = Integer.parseInt(con);
        }
        while(y1<7){
            countPosicion++;
            y1++;
            String sX = String.valueOf(x);
            String sY1 = String.valueOf(y1);
            String con = sX + sY1;
            int resultado = Integer.parseInt(con);
        }
        while(x1>0){
            countPosicion++;
            x1--;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
        }
        while(x1<7){
            countPosicion++;
            x1++;
            String sX1 = String.valueOf(x1);
            String sY = String.valueOf(y);
            String con = sX1 + sY;
            int resultado = Integer.parseInt(con);
        }
    }
}


