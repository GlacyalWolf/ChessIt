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
}
