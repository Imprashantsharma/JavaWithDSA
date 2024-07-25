import java.util.*;

public class breakc{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter the number: ");
            int n = sc.nextInt();
            if(n % 10 == 0){                
              //  break;
              continue;
            }
            System.out.println("your number is :" + n);
        }while(true);
    }
}