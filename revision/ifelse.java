import java.util.*;
public class ifelse{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int age=sc.nextInt();
     // int age=11;
      if(age>18){
          System.out.println("ladka jaban ho gya....");
      }
      else if(age>=13 && age<=18){
          System.out.println(" BALAK HAI ABHI TU....");
      }
      else{
          System.out.println(" NANHA BACHA...");

      }
    }
}