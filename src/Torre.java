public class Torre extends Ficha{

    String nombre;

    Torre(){
        nombre = "T";
    }
    /*Posible moviment devuelve un integro como 22 o si tiene un 0 delante 02 devuelve 2
    PD.
    Cayetano marico si quieres canviarlo es fasil ya lo saveeee boy.
     */

    private void posibleMovimiento(int x,int y){
        int y1=y;
        int x1=x;


        while(y1>0) {

            y1--;
            String sX = String.valueOf(x);
            String sY1 = String.valueOf(y1);
            String con = sX + sY1;
            int resultado = Integer.parseInt(con);
        }
        while(y1<7){

            y1++;
            String sX = String.valueOf(x);
            String sY1 = String.valueOf(y1);
            String con = sX + sY1;
            int resultado = Integer.parseInt(con);
        }
        while(x1>0){

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


