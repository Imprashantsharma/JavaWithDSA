import java.util.*;

public class create{
    public static boolean search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
           for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j] == key){
               System.out.print("the key is at index  (" + i + "," + j +")");
               return true;
               }
        }}
        System.out.print("key not found");
        return false;
    }


  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int matrix[][] = new int[3][3];
    int m = matrix.length;
    int n = matrix[0].length;
     
     //input
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
             matrix[i][j] = sc.nextInt();
        }
    }

    //output
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
   search(matrix , 5);
}
}