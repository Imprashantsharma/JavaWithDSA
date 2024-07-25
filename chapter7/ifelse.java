import java.util.*;

public class ifelse{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
       // int b = sc.nextInt();
     
       /* larger between two numbers
       
        if(a>=b){
            System.out.print("a is larger");

        }
         else{
             System.out.print("b is larger");
         }   */
        if(num%2 == 0){
            System.out.print("no is EVEN");
        }else{
            System.out.print("no is ODD");
        }
    }
}