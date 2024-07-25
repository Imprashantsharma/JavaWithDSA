public class p2{
    public static int print_sum(int nums[][]){
        int sum = 0;

        
            for(int j=0; j<nums[0].length; j++ ){
             //   if(i==1)
                sum += nums[1][j];
            }
        
        return sum;
    }

    public static void main(String args[]){
        int nums[][] = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        System.out.print(print_sum(nums));                
    }
}