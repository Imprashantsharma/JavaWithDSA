import java.util.*;

public class p1{ 
    public static void  average(int a,int b,int c){
        int sum = a + b + c;
        float aver = (float)sum/3;
        System.out.println("the average of three numbes is "+ aver);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
}