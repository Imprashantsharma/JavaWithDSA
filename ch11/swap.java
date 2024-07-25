import java.util.*;

public class swap{
    public static void swap(int a,int b){
        int temp =a;
        a =b;
        b =temp;
        System.out.println("a = " + a);
        System.out.print("b = " + b);                         // we can also do it by 
     //   return 0;                                           // using int at place of void and using return
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }
}
