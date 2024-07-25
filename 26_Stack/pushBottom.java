import java.util.*;

public class pushBottom{
    public static void pushATBottom(Stack<Integer> s, int data){
       if(s.isEmpty()){
           s.push(data);
           return;
       }

       int top = s.pop();
       pushATBottom(s,data);
       s.push(top);
    }
                                                                     //  O(n)

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushATBottom( s, 4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}