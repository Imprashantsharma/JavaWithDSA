public class p2{
    public static int rotate_the_array(int nums[], int target){
      // int index = 0;
       for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
       }
       return -1;
    }

    public static void main(String args[]){
        int nums[] = {7,6,9,4,5};
        int target = 4;
        System.out.print(rotate_the_array(nums,target));
    }
}