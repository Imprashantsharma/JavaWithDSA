import java.util.*;

public class bacicpattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        
        int n = 4;

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("");
        } 
    }
}