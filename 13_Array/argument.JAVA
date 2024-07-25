import java.util.*;
public class argument{
    public static void update(int numbers[],int n){
         n=5;
        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers[i] + 1;
          //  System.out.print(numbers[i]+ ", ");
        }
    }

    public static void main(String args[]){
        int numbers[] = {89,54,34};
        int n=34;
        update(numbers,n);

        System.out.println(n);                      // call by value

        for(int i=0; i<numbers.length; i++){                //
            System.out.print(numbers[i] + " ");             //call by refrence  
        }                                                   //
        System.out.println();
         
    }
}