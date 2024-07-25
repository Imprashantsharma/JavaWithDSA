import java.util.*;

public class trenaryop {
    public static void main(String args[]){


       /* Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt();
         
        String result = number>33 ? "pass" : "fail";
         System.out.print(result);*/


    
        Scanner sc = new Scanner(System.in); 
        System.out.print("write the marks ");
        int marks = sc.nextInt();
        System.out.print("write the Maximum marks ");
        int maximum = sc.nextInt();
        float percent;
        percent =  (marks*100)/maximum;
        System.out.println("Percentage is " + percent);

         
        String result = percent>=33 ? "pass" : "fail";
         System.out.print(result);
    }
}