import java.util.*;

public class Conversion{
    public static void main(String agrs[]){

        /*      type Conversion / widening conversion / implicit Conversion

        Scanner sc = new Scanner(System.in);
        //int num = sc.nextFloat();
        float num = sc.nextInt();
        System.out.println(num);
        */
        

        /* Type Casting  /  Type Narrowing / Type explicit
        
        Scanner sc = new Scanner(System.in);
        float a = 24.22f;
        int b = (int)a;
        System.out.println(b);               */


        // Type Promotion
        char a = 'a';
        char b = 'b';
        int sum = a-b;
        System.out.println(sum);

        int c = 10;
        float d = 20.5f;
        long e = 25;
        double f = 30;
        double ans = c + d + e + f;
        System.out.println(ans);

        

    }
}