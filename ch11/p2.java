import java.util.*;

public class p2{
    public static boolean iseven(int n){
        boolean iseven;
        if( n % 2 == 0){
              iseven = true;
        } else{
            iseven = false;
        }
        return iseven;
    }
      public static void main(String args[]){
        System.out.print(iseven(25));
      } 
}