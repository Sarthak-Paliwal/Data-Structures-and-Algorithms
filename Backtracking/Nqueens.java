public class Nqueens{
    static int count=0;
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueens(char board[][],int row){
        if(row==board.length){
            count++;
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
            Nqueens(board,row+1);
            board[row][j]='X';
            }
            
        }
    }
    
    public static void printBoard(char Board[][]){
        System.out.println("______________");
        for(int i=0;i<Board.length;i++){
            for(int j=0;j<Board.length;j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int n=4;
        char Board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Board[i][j]='X';
            }
        }
        Nqueens(Board,0);
        System.out.println("Total ways to solve:"+count);
    }
}
