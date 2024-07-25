import java.util.ArrayList;
import java.util.Collections;

public class p2{
    public static void LonelyNumber(ArrayList<Integer> nums){
       Collections.sort(nums);
       
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=1; i<nums.size()-1; i++){
           if( nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1 < nums.get(i+1)){
               list.add(nums.get(i));
           }
       }

       if(nums.size() == 1){
           list.add(nums.get(0));
       }

       else if(nums.size() > 1){
           if(nums.get(0) +1 < nums.get(1)) {
               list.add(nums.get(0));
           }

           if(nums.get(nums.size() - 2 ) + 1 < nums.get(nums.size()-1 )){
               list.add( nums.get(nums.size()-1 ));
           }
       }

       System.out.print(list);

    }

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        LonelyNumber(nums);
    }
}