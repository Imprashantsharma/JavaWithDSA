import java.util.*;
public class function{
    public static int sum(int a,int b){
        int add = a+b;
        System.out.println("sum is " + add);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        sum(a,b);
    }
}