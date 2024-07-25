public class diagonal{
    public static int diagonal_matrix(int matrix[][]){
         int n = matrix.length;
         int m = matrix[0].length;

         int sum = 0;

         for(int i=0; i<n; i++){
             for(int j=0; j<m; j++){
                 if(i == j){
                   sum += matrix[i][j];
                 }                                               // this is brute force method
                 if(i+j == n-1){                                 // whose complexity is O(n^2)
                     sum += matrix[i][j];
                 }
             }
             
         }
         return sum;
    }
    
    public static int diagonal_matr(int matrix[][]){
         int n = matrix.length;

         int sum = 0;

         for(int i=0; i<n; i++){
             //pd                                                   // standard method
             sum += matrix[i][i];                                   // complexity = O(n)
             //sd
             if(i!=n-1-i){
             sum += matrix[i][n-i-1]; 
             }
         }
         return sum;
    }
    
    public static void main(String args[]){
         int matrix[][] = { {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};

        // System.out.print(diagonal_matrix(matrix));                  
         System.out.print(diagonal_matr(matrix));                  
    }
}