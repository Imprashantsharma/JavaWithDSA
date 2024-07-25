import java.util.*;
public class search{
    public static int getlargest(int number[]){
       int largest = Integer.MIN_VALUE;

       for(int i=0; i<number.length; i++){
           if(number[i]>largest){
               largest = number[i];
           }
       }
       return largest;
    }


    public static int binarysearch(int number[], int key){
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            else if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }


    public static int linearsearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
            return -1;
    }
    public static void main(String args[]){
        int number[] = {2,4,3,8,10,12,9};
        int key=10;
        System.out.println("the largest number is " + getlargest(number) );
        
      /*  int index = binarysearch(number,key);
        if(index == -1){
            System.out.println(" number not found");
        }else{
            System.out.println(" number IS AT INDEX " + index);
            
        } */

        /*
        int index = linearsearch(number,key);
        if(index == -1){
            System.out.println(" number not found");
        }else{
            System.out.println(" number IS AT INDEX " + index);
            
        }*/
    
    }
}