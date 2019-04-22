public class Alfil {
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
        }
        y1=y;
        x1=x;
        while(y1<7 && x1>0){
            mov++;
            y1--;
            x1--;
        }

        y1=y;
        x1=x;

        while(x1>0 && y1<7){
            mov++;
            x1--;
            y1++;
        }

        y1=y;
        x1=x;
        while(x1<7 && y1>0){
            mov++;
            x1++;
            y1--;
        }
        return mov;
    }

}
