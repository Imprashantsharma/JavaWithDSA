import java.util.*;

public class weak{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        int weak =sc.nextInt();

        switch(weak) {
            case 1 : System.out.println("monday") ;
                        break;
            case 2 : System.out.println("tuesday");
                        break;
            case 3 : System.out.println("wednesday") ;
                        break;
            case 4 : System.out.println("thursday") ;
                        break;
            case 5 : System.out.println("friday") ;
                        break;
            case 6 : System.out.println("saturday") ;
                        break;
            case 7 : System.out.println("paneer day") ;
                        break;
           default : System.out.print(" a tu jaa re");            

        }
    }
}