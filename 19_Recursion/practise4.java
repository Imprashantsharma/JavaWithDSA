public class practise4{
    public static int  CountSubStr(String str, int i, int j, int n){
        if(n == 1 || n <= 0){      // base case
            return n;
        }

        int res = CountSubStr(str,i+1,j,n-1) + CountSubStr(str,i,j-1,n-1) - CountSubStr(str,i,j-1,n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }

        return res;
    }


    public static void main(String args[]){
        String str = "abcab";
        int n = str.length();
        System.out.print(CountSubStr(str, 0, n-1, n));
    }
}