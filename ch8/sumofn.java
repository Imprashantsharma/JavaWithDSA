import java.util.*;

public class sumofn{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter<=range){
            sum = sum + counter;
           counter++;
        }
            System.out.print(sum + " ");
    }
}