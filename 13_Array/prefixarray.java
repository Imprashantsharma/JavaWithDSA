public class prefixarray{
    public static void prefix_array(int number[]){
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        System.out.print( "PREFIX ARRAY IS "+ prefix[0] + " ");

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        System.out.print( prefix[i] + " ");
        }

        System.out.println();
        for(int i=0; i<=number.length; i++){
            for(int j=i; j<number.length; j++){
                CurrSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if(MaxSum < CurrSum){
                MaxSum = CurrSum;
            }
        }
        System.out.println(" maximum subarray " + MaxSum );
    }

    public static void kadanes(int number1[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<number1.length; i++){
            cs = cs + number1[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max( cs, ms);
        }
        System.out.println(" maximum sun of subarray" + ms);
    }


    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3};
        int number1[] = {-2,-3,4,-1,-2,1,5,-3};
        prefix_array(number);
        kadanes(number1);
    }
}