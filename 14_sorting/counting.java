import java.util.*;

public class counting{
    public static void counting_sort(int array[]){
       int Largest = Integer.MIN_VALUE;
       for(int i=0; i< array.length; i++){
           Largest = Math.max(Largest,array[i]);
       }

       // count
       int count[] = new int[Largest+1];
       for(int i=0; i<array.length; i++){
           count[array[i]]++;
       }

       //sort
       int j=0;
       for(int i=0; i<count.length; i++){
           while(count[i]>0){
               array[j] = i;
               j++;
               count[i]--;
           }
       }
    }

    public static void printarray(int array[]){
        for(int i =0; i<array.length; i++){
             System.out.print(array[i]);
        }
    }
    public static void main(String args[]){
        int array[] = {3,6,2,1,8,7,4,5,3,1};
        counting_sort(array);
        printarray(array);
    }
}