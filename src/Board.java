public class Board {

    private Casilla[][] board;

    private static int setNumRow(int num){
        if (num==0){
            return 7;
        }
        else if (num==1){
            return 6;
        }
        else if (num==2){
            return 5;
        }
        else if (num==3){
            return 4;
        }
        else if (num==4){
            return 3;
        }
        else if (num==5){
            return 2;
        }
        else if (num==6){
            return 1;
        }
        else{
            return 0;
        }
    }
    private static boolean setPiece(int num){
        return num == 0 || num == 1 || num == 6 || num == 7;
    }

    Board() {
        this.board = new Casilla[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Casilla();
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j].setNumCol(j);
                board[i][j].setRowNum(setNumRow(i));
                board[i][j].setIsPiece(setPiece(i));
            }
        }
    }
    public void printBoard(){
        int num = 7;
        System.out.println("   0  1  2  3  4  5  6  7");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i][j].getIsPiece() && j!=0 && j!=8) {
                    System.out.print(board[i][j-1].getRowNum() + "" + board[i][j-1].getNumCol() + " ");
                }
                else if (!board[i][j].getIsPiece() && j!=0 && j!=8){
                    if(board[i][j].getIsPossibleMoving()) {
                        System.out.print(" X ");
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                else{
                    System.out.print(num + " ");
                }
            }
            if(board[i][7].getIsPiece()) {
                System.out.print(board[i][7].getRowNum() + "" + board[i][7].getNumCol());
            }
            else {
                if(board[i][7].getIsPossibleMoving()) {
                    System.out.print(" X ");
                }
                else{
                    System.out.print("   ");
                }
            }
            num--;
            System.out.println();
        }
    }
}