import java.util.ArrayList;

public class PairSum1{
            //-------------------------for sorted arraylist---------------------
    /*

    //Brute force  ---------O(n)-----------
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }

        return false;
    
    }  */
    
    // 2 pointer approach     -------O(n)----------
    public static boolean pairSum1( ArrayList<Integer> list, int target){
        int LP = 0;
        int RP = list.size()-1;

        while(LP < RP){
            if(list.get(LP) + list.get(RP) == target){
                return true;
            }
            else if(list.get(LP) + list.get(RP) > target){
                RP--;
            }
            else{
                LP++;
            }
        }

        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 8;

        System.out.print(pairSum1(list, target));
    }
}