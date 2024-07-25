import java.util.*;
public class basicarray{
    public static void main(String Args[]){
        int numbers[] = new int[50];

        System.out.println("the size of array is " + numbers.length );   //size of array
        
        Scanner sc = new Scanner(System.in);
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();         //input in array
        numbers[2] = sc.nextInt();

        System.out.println("marks of physics =" + numbers[0]);
        System.out.println("marks of chemistry =" + numbers[1]);       // output in array
        System.out.println("marks of maths =" + numbers[2]);

        System.out.println();

        numbers[2] = numbers[2]+1;
        System.out.println("updated marks of maths is " +numbers[2]);
    }
}