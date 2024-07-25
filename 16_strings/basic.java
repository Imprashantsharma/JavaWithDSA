import java.util.*;

public class basic{
    public static void print_charecters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      // String name = sc.next();
       String fullname = sc.nextLine();
        
       // System.out.println(fullname);
       // System.out.print(fullname.length());
         print_charecters(fullname);
        
    }
}