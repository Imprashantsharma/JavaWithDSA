import java.util.ArrayList;

public class opeartions{
    public static void main(String args[]){

        //create arraylist
        ArrayList<Integer> list = new ArrayList<>();
        
        //add

        list.add(1);    // O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9);            // O(n)
        System.out.println(list);

        // get opeartion    - O(1)
        int element = list.get(3);
        System.out.println(element);

        // Remove opeartion    - O(n)
        list.remove(2);
        System.out.println(list);

        // Set Operation       -O(n)
        list.set(1,5);
        System.out.println(list);

        // Contaons Operation    -O(n)
        
        System.out.println( list.contains(3));
        System.out.println( list.contains(5));
        System.out.println( list.contains(6));

    }
}
