import java.util.*;

public class inbuild{

public static void main(String args[]){
    Integer array[] = {5,4,7,2,5,1,3};
    Arrays.sort(array,0,5,Collections.reverseOrder());
   
    for(int i=0; i<array.length; i++){
        System.out.print(array[i]+", ");
    }
}
}