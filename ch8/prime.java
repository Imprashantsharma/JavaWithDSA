import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i = 2;i<=n;i++){
            if(n % i == 0);{
                isprime = false;
                break;
            }}
            if(isprime=false){
                System.out.print("no is not prime");
            }else{
                System.out.print("no is not prime");
            }
        
    }
}