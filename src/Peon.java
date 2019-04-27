public class Peon extends Ficha{
    private void posibleMovimiento(int x,int y){
        int y1=y;
        int x1=x;
        int countPosicion=-1;
        boolean color;
        boolean posicionInicial=true;

        if (posicionInicial=true && color==true){
            y1=y1-2;
            }
        if (posicionInicial=true && color==false){
            y1=y1+2
        }

        }

        if (color==true){
            y1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                String sX = String.valueOf(x);
                String sY1 = String.valueOf(y1);
                String con = sX + sY1;
                int resultado = Integer.parseInt(con);
            }

            x1++;
            /** coger cordenadas **/
            if((x1<7 || x1>0) && (y1>7 || y1<0) ) {
                String sX = String.valueOf(x);
                String sY1 = String.valueOf(y1);
                String con = sX + sY1;
                int resultado = Integer.parseInt(con);
            }
            x1=x;
            x1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                String sX = String.valueOf(x);
                String sY1 = String.valueOf(y1);
                String con = sX + sY1;
                int resultado = Integer.parseInt(con);
            }

        }
        else{
            y1++;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                String sX = String.valueOf(x);
                String sY1 = String.valueOf(y1);
                String con = sX + sY1;
                int resultado = Integer.parseInt(con);
            }

            x1++;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                String sX = String.valueOf(x);
                String sY1 = String.valueOf(y1);
                String con = sX + sY1;
                int resultado = Integer.parseInt(con);
            }
            x1=x;
            x1--;
            /** coger cordenadas **/
            if((x1>7 || x1<0) && (y1>7 || y1<0) ) {
                String sX = String.valueOf(x);
                String sY1 = String.valueOf(y1);
                String con = sX + sY1;
                int resultado = Integer.parseInt(con);
            }


    }
    }


}
