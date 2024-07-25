import java.util.ArrayList;

public class PairSum2{
    
    /*    -----------------O(n^2)-----------BRUTE FORCE-----------

    public static boolean SumOfPair2(ArrayList<Integer> list, int target){
       // int LP=0;
       // int RP = list.size()-1;

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if( list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }

        return false;

    }     */
    
    public static boolean SumOfPair2(ArrayList<Integer> list, int target){
       int bp = -1;
       int n = list.size();

       for(int i=0; i<list.size(); i++){
           if(list.get(i) > list.get(i+1)){
               bp = i;
               break;
           }
       }
       
       int LP = bp+1;
       int RP = bp;

       while(LP != RP){
           if(list.get(LP) + list.get(RP) == target){
               return true;
           }
           else if(list.get(LP) + list.get(RP) > target){
               RP = (n+RP-1) % n;
           }
           else {
               LP = (LP+1) % n;
           }
       }

       return false;
    }

    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // 11,15,6,8,9,10   ---- Sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 19;

        System.out.print(SumOfPair2(list, target));
    }
}