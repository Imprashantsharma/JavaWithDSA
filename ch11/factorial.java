import java.util.*;

public class factorial{
    public static int facto(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
           f=f*i;
        }
        return f;
    } 
    public static int binomialfact(int n,int r){
      int fact_n = facto(n);
      int fact_r = facto(r);
      int fact_nmr = facto(n-r);

      int bin_fact =( facto(r)*facto(n-r));
      int binomial_fact = (facto(n)/ bin_fact);
      return binomial_fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
       System.out.print(binomialfact(n,r));
        
    }
}