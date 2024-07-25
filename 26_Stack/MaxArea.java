import java.util.*;

                     // --------------------O(n)-Optimized Code-------------------------

public class MaxArea{
    
    public static void maxArea(int arr[]){                      
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //Next Smaller Right
       
        Stack<Integer> s = new Stack<>();              

        for(int i=arr.length-1; i>=0; i--){
             
             // 1 while
             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
             }

             // 2 if_ else
             if(s.isEmpty()){
                 nsr[i] = arr.length;
             }else{
                 nsr[i] = s.peek();
             }

             //3 pushin s
             s.push(i);
        
        }

        // Nexr Smaller Left

        s = new Stack<>();
       

        for(int i=0; i<arr.length; i++){
             
             // 1 while
             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                 s.pop();
             }

             // 2 if_ else
             if(s.isEmpty()){
                 nsl[i] = -1;
             }else{
                 nsl[i] = s.peek();
             }

             //3 pushin s
             s.push(i);
        }

        // Current Area
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;       
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }

         System.out.print("the maximum area of Histogram is = "+ maxArea);
    
    }

    public static void main(String args[]){
        int arr[] = {2, 1, 5, 6, 1, 3};
        maxArea(arr);
    }
}