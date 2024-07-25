import java.util.*;

public class large3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         
         if ( (a>=b) && (a>=c) ){
             System.out.print("largest number is" + a);
         }
         else if( (b>=c) ){
             System.out.print("largest number is " + b);
         } else{
             System.out.print("largest number is" + c);

         }
    }
}