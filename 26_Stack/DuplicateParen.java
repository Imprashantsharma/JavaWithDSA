import java.util.*;

public class DuplicateParen{
    public static boolean IsDulpicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;   // dupicate
                }else{
                    s.pop();     //opening pair remove
                }
            }

            else{
                //opening pair
                s.push(ch);
            }
        }

        return false;

    }
    public static void main(String args[]){
        //valid string
        String str1 = "((a+b))";   //true
        String str2 = "(a+b)";     //false
        System.out.println(IsDulpicate(str1));
        System.out.println(IsDulpicate(str2));
    } 
}