import java.util.ArrayList;
import java.util.Collections;

public class size{
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx2);
        list.set(idx2, list.get(idx1));
        list.set(idx1, temp);
    }


    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(8);

        int idx1 =1 , idx2 = 3;
        
        int max = Integer.MIN_VALUE;

       for(int i=0; i<list.size(); i++){            //O(n)
         //  if(max < list.get(i)){
         //      max = list.get(i);
         //  }
         max = Math.max(max, list.get(i));
       }

       System.out.println("the maximum number in AL is "+max);


       System.out.println(list);
       swap(list, idx1, idx2);
       System.out.println(list);


       // sorting 
       Collections.sort(list);    // ascending order
       System.out.println(list);

       // descending order
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
    }
}