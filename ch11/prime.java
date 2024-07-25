import java.util.*;

public class prime{
    public static boolean isprime(int n){
        boolean isprime = true;
  
       // for(int i=2;i<= n-1;i++){
        for(int i=2;i<= Math.sqrt(n);i++){
            if(n % i == 0){
                isprime = false;
                return isprime;
               // break;
            }
        }
        return isprime;
    }
    public static void primerange(int n){
        for(int i =2;i<=n-1;i++){
            if( isprime(i)) {
                System.out.print(i + " ");
            } 
        }
         
    }
    public static void main(String args[]){
         primerange(200);
    }
}