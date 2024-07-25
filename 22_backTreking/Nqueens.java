public class Nqueens{
    
    public static boolean isSafe(char Board[][], int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(Board[i][col] == 'Q'){
                return false;
            }
        }

        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
             if(Board[i][j] == 'Q'){
                return false;
            }
        }

        //diag right up
         for(int i=row-1, j=col+1; i>=0 && j<Board.length; i--,j++){
             if(Board[i][j] == 'Q'){
                return false;
            }
        }
        
        return true;
    }

    public static void nqueens(char Board[][], int row){
       //base
       if(row == Board.length){
           printBoard(Board);
           count++;
           return;
       }

       //recursion
       //coloum loop
       for(int j=0; j<Board.length; j++){
           if(isSafe(Board,row,j) ) {
                Board[row][j] = 'Q';
                nqueens(Board,row+1);   // function call
                Board[row][j] = 'X';    //backtreking step
           }
       }
    }

    public static void printBoard(char Board[][]){
        System.out.println("---------chess board----------");

        for(int i=0; i<Board.length; i++){
            for(int j=0; j<Board.length; j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static int count = 0;

    public static void main(String args[]){
        int n = 4;

        char Board[][] = new char[n][n];
        //initilize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Board[i][j] = 'X';
            }
        }

        nqueens(Board , 0);
        System.out.println("the total number of ways in which nqueen placed = "+count);
    }
}