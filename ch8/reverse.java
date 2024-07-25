import java.util.*;

public class reverse{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;
    while(n>0){
        int lstdigit = n%10;
        rev = rev*10 + lstdigit;
        n=n/10;
    }
      System.out.print(rev);

       /* int n = 234567;
        while(n>0){
            int lstdigit = n % 10;
            System.out.print(lstdigit);
            n = n / 10;
        }*/
    }
}