import java.util.*;

public class DeQue{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        System.out.println(deque);
        deque.addLast(3);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first no is "+ deque.getFirst());
        System.out.println("Last no is "+ deque.getLast());
      //  System.out.print(deque.removeFirst);

    }
}