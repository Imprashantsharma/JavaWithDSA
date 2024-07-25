public class oddeven{
    public static void evenORodd(int n){
        int BitMask =1;
        if( (n & BitMask) == 0){
            //no is even
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
         evenORodd(5);
         evenORodd(10);
         evenORodd(6);
    }
}