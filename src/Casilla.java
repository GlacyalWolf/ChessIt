public class Casilla {

    private int numCol;
    private int rowNum;
    private boolean isPiece;
    private boolean isPossibleMoving;

    Casilla(){
        this.isPossibleMoving = false;
    }

    public int getNumCol(){
        return numCol;
    }
    public int getRowNum(){
        return rowNum;
    }
    public boolean getIsPiece(){
        return isPiece;
    }
    public boolean getIsPossibleMoving() { return isPossibleMoving; }
    public void setNumCol(int numCol){
        this.numCol = numCol;
    }
    public void setRowNum(int rowNum){
        this.rowNum = rowNum;
    }
    public void setIsPiece(boolean isPiece){
        this.isPiece = isPiece;
    }
    public void setPossibleMoving(boolean isPossibleMoving) { this.isPossibleMoving = isPossibleMoving; }
}
