public class daimond{
    public static void daimond(int n){
        
        //for first half
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //for stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // second half
        for(int i=n;i>=1;i--){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //for stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
      daimond(4);
    }
}