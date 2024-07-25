import java.util.*;

public class PRACTISE{
    public static void BubbleSort(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]<array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    // tutors code od bubble sort
    public static void tutorBubbleSort(int array[]){
    for(int turn = 0; turn<array.length-1; turn++){
        for(int j=0; j< array.length-1-turn; j++){
            if(array[j]< array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    }

    public static void insertionSort(int array[]){
       for(int i=0; i<array.length; i++){
           int temp = array[i];
           int j=i-1;
           
               while( j>= 0 && array[j]< temp){
                   array[j+1] = array[j];
                   j--;
               }
               //insertion
               array[j+1] = temp;
           
       }
    }
     
     public static void countingSort(int array[]){
         int largest = Integer.MIN_VALUE;
         for(int i=0; i<array.length; i++){
             largest = Math.max(largest, array[i]);
         }

         int count[] = new int[largest+1];
         for(int i=0; i< array.length; i++){
             count[array[i]]++;
         }

         //sorting
         int j=0;
         for(int i=count.length-1; i>=0; i--){
             while(count[i]>0){
                 array[j] = i;
                 j++;
                 count[i]--;
             }
         }
     }

    public static void printarray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[] = {3,6,2,1,8,7,4,5,3,1};
      // BubbleSort(array);
      // tutorBubbleSort(array);
      // insertionSort(array);
       countingSort(array);  
        printarray(array);
    }
}