import java.util.*;

public class p5{
    public static void sumofinteger( int n){
        int sum = 0;
        while(n>0){
            int LastDigit = n % 10;
            sum = sum + LastDigit;
            n = n/10;
        }
        System.out.print("the sun of integers of the number " + sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumofinteger(n);


    }
}