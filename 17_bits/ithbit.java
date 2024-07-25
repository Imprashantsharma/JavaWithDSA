public class ithbit{
    public static int GetIthBit(int n,int i){
        int BitMask = 1<<i;
        if( (n & BitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int SetIthBit(int n,int i){
        int BitMask = 1<<i;
        return n | BitMask;
    }

    public static int ClearIthBit(int n, int i){
        int BitMask =  ~(1<<i);
        return n & BitMask;
    }

    public static int UpdateIthBit(int n, int i, int Nb){
        n = ClearIthBit(n,i);

            int BitMask = (Nb << i);
            return n | BitMask ;
        
    }

    public static int ClearLastIBits(int n, int i){
        int BitMask = (~0)<<i;
        return n & BitMask;
    } 

    public static int ClearBitsInRange(int n, int i, int j){
          int a = ( (~0)<<(j+1) );
          int b = ( (1<<i)-1 );
          int BitMask = a | b;
          return n & BitMask;
    }


    public static void main(String args[]){
         System.out.println(ClearBitsInRange(10,2,4));
    }
}