import java.util.*;

public class Condition{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if( age > 18){
            System.out.println("Beta jaban ho gaya tu to");
        }else if( (age >= 13) && (age <=18) ){
            System.out.println("Beta jaban ho RHA HAI tu to");
        } else{
             System.out.println("baccha hai re tu toh");
        }
    }
}