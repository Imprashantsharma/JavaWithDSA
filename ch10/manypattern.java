import java.util.*;

public class manypattern{
    public static void inverted_rotated_half_pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1;j <=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    // INVERTED HALF PYRAMID WITH NUMBERS
    public static void inverted_half_pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //floyed triangle
    public static void floyedtriangle(int n){
        int num = 1;
        for(int i = 1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(num+" ");
                 num++;
             }
             System.out.println();
        }
    }
    // 01 triangle
    public static void zero_one_triangle(int n){
        for(int i = 1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 if( (i+j)%2==0 ){
                     System.out.print("1");
                 }else{
                     System.out.print("0");
                 }
             }
             System.out.println();
        }
    }
    // butterfly patterns
    public static void butterfly(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        //next part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // solid rhombus
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    //hollow rhombus

    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //for hollow rectangle
            for(int j=1;j<=n;j++){
                if( i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    } 

    // diamond pattern

   public static void diamond(int n){
        //for first half
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for(int i=n;i>=1;i--){
            
        
            //for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //number pyramid

    public static void number_pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }

    }

    // Palindromic pattern with numbers

    public static void palindromic(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //decending loop
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //asending loop
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            
            //next line
            System.out.println();
        }
    }
    public static void main(String args[]){                                                                                             
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         inverted_half_pyramid(n);
         inverted_rotated_half_pyramid(n);
         floyedtriangle(n);
         zero_one_triangle(n);
        butterfly(n);
         rhombus(n);
         hollow_rhombus(n);
         diamond(n);
         number_pyramid(n);
        palindromic(n);
    }
}