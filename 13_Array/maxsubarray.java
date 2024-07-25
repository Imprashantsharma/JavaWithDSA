public class maxsubarray{
    public static void get_subarray(int number[]){
        int CurSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                   CurSum = 0;
                for( int k=i; k <=j ; k++){
                    CurSum = CurSum + number[k];
                }
                System.out.println(CurSum);
                  if(MaxSum < CurSum){
                      MaxSum = CurSum;
                  }
               
            }
        }
        System.out.println("maximum subarray ="+ MaxSum);
    }
    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3};
        get_subarray(number);
    }
}