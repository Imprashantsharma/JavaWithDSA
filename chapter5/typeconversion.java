import java.util.*;

public class typeconversion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //lossy conversion from float to int
       // int number = sc.nextFloat();
       // System.out.print(number);

       //type casting
        int number = (int)sc.nextFloat();
        System.out.print(number);
    

       //not lossy conversion
       // float number = sc.nextInt();
       // System.out.print(number);

    }
}