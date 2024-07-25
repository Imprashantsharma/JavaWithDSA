public class print{
    public static void dec_numbr(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n +" ");
        dec_numbr(n-1);
    }

    public static void inc_numbr(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc_numbr(n-1);
        System.out.print(n +" ");
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int Fnm1 = factorial(n-1);
        int Fn = n * Fnm1;
        return Fn;
    }

    public static int sum_naturalNO(int n){
        if(n==1){
            return 1;
        }
       int SNm1 = sum_naturalNO(n-1);
       int SN = n + sum_naturalNO(n-1);
       return SN;
    }

    public static int Fibonacci(int n){
        if( n==0 || n==1){
            return n;
        }
        int FNm1 = Fibonacci(n-1);
        int FNm2 = Fibonacci(n-2);
        int fb = FNm1 + FNm2;
        return fb;
    }

    public static boolean isSorted(int arr[], int i){
       if(i == arr.length-1){
           return true;
       }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccerence(int arr[], int key, int i){
       if(i == arr.length){
           return -1;
       }
        if(arr[i] == key){
            return i;
        }

        return firstOccerence(arr, key, i+1);
    }

     public static int lastOccerence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccerence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

       
       return isFound;
     }

    public static int power(int x,int n){
       if(n==0){
           return 1;
       }
        int PNm1 = power(x,n-1);
        int p = x * PNm1;
        return p;
    }

    public static int powerOptimized(int x, int n){
        if(n==0){
            return 1;
        }
          int Halfpow = powerOptimized(x,n/2);                      //     this code has 
          int HalfpowSq = Halfpow * Halfpow;                        //             O(logn) - time complexity
       // int HalfpowSq = powerOptimized(x,n/2) * powerOptimized(x,n/2);     it gives O(n) - time complexity

        // for odd
        if(n%2 != 0){
            HalfpowSq = x * HalfpowSq;
        }

        return HalfpowSq;
    }
    public static void main(String args[]){
     System.out.println(powerOptimized(2,10));
    }
}