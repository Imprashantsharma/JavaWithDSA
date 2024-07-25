import java.util.*;

public class product{
    public static int product(int a,int b){
        int multi = a*b;
        return multi;
     //   System.out.print(multi);
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
    int prod = product(a,b);
      System.out.print(prod);
    
    }

    
}