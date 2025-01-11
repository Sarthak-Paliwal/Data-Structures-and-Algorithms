public class Sudoku {
public static boolean isSafe(int suduko[][],int row,int col,int digit){
    return true;
    
}
    public static boolean sudukoSolver(int suduko[][],int row,int col){
        
        int nextRow=row;int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(suduko,row,col,digit)){
                suduko[row][col]=digit;
                if(sudukoSolver(suduko, nextRow, nextCol)){
                    return true;
                }
                suduko[row][col]=0;

            }
        }

    }
    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 },

        };
    }

}
