public class Torre extends Ficha{

    String nombre;

    Torre(){
        nombre = "T";
    }
    /*Posible moviment devuelve un integro como 22 o si tiene un 0 delante 02 devuelve 2
    PD.
    Cayetano marico si quieres canviarlo es fasil ya lo saveeee boy.
     */

    private void posibleMovimientoTorre(int x,int y){
        int y1=y;
        int x1=x;


        while(y1>0) {

            y1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(y1<7){

            y1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(x1>0){

            x1--;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
        while(x1<7){
            x1++;
            if (!board.getIsOcupied(x1, y1)) {
                board.setPosibleMoving(x1, y1);
            }
            else{
                continue;
            }
        }
    }
}


