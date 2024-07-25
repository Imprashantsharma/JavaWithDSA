import java.util.*;

public class evenodd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int continue;
        int n;
        do{
        System.out.print("enter the number baby");
         n = sc.nextInt();
            if( n % 2 == 0 ){
                evensum += n;
            } else {
                oddsum += n;
            }
            System.out.print("enter 1 to stop");
             continue = sc.nextInt();
        } while(continue == 1);

        System.out.println("the sun off even numbers is " + evensum);
        System.out.println("the sun off odd numbers is " + oddsum);
    }
}