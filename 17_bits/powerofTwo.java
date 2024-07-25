public class powerofTwo{
    public static boolean PowerOf2(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(PowerOf2(7));

    }
}