import java.util.*;

public class p1{
    public static void vowels(String str){
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.print("no of vowels is "+ count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        vowels(name);
    }
}