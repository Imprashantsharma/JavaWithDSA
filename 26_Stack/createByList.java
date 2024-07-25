public class createByList{

    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        public static boolean IsEmpty(){
            return head == null;
        }

        //push
        public static void Push(int data){
            Node newNode = new Node(data);

            if(IsEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int Pop(){

            if(IsEmpty() ){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        } 

        //peek
        public static int Peek(){

           if(IsEmpty() ){
                return -1;
            }

            return head.data;  
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