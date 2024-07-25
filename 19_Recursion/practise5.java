public class practise5{
    public static void TowerOfHanio(int n, String sou, String hlpr, String desti){
        if(n == 1){
             System.out.println("transfer disk "+n +" from " + sou +" to " +desti );
             return;
        }

        TowerOfHanio(n-1,sou,desti,hlpr);
        System.out.println("transfer disk "+n+" from "+sou+" to "+ desti);
        TowerOfHanio(n-1,hlpr,sou,desti);
    }
    public static void main(String args[]){
        int n = 1;
        TowerOfHanio( n, "S", "H", "D");
    }
}