public class gridWays{
    public static int CountGridWays(int i, int j, int n, int m){
        
        //base case
        if(i == n-1 && j == m-1){    // condition for lst cell
            return 1;
        } else if(i == n || j == m){
            return 0;
        }

        //kaam
        int w1 = CountGridWays(i+1,j,n,m);
        int w2 = CountGridWays(i,j+1,n,m);
        return w1+w2;
    }

    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(CountGridWays(0,0,n,m));

    }
}