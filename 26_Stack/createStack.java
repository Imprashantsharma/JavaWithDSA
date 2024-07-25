import java.util.ArrayList;

public class createStack{


    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

         public static boolean IsEmpty(){
             return list.size() == 0;
         }

         //push
         public static void Push(int data){
             list.add(data);
         }

         //pop
         public static int Pop(){

             if(IsEmpty()){
                 return -1;
             }

             int top = list.get(list.size() - 1);
             list.remove(list.size() - 1);
             return top;
         }

         //peek

          public static int Peek(){
              
            if(IsEmpty()){
                 return -1;
             }
             
            return list.get(list.size() - 1);
         }
    }


    public static void main(String args[]){
        Stack S = new Stack();
        S.Push(1);
        S.Push(2);
        S.Push(3);
        S.Push(4);

         while(!S.IsEmpty()){
             System.out.println(S.Peek());
             S.Pop();
         }
    }
}