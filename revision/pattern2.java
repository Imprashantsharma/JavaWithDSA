public class pattern2{ 
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        } 

        //second part
        for(int i=n; i>=1; i--){
             for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }


    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void butterfly(int n){
        for(int i=1; i<=n; i++){

            // for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //for spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second part
        for(int i=n; i>=1; i--){
             // for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //for spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int add =i+j;
                if(add % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void floyedtriangle(int n){
    int num=1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(num +" ");
            num++;
        }
        System.out.println();
    }
    }


    public static void inverted_half_pyramid(int n){
       for(int i=1; i<=n;i++){
           for(int j=1;j<=n-i+1;j++){
               System.out.print(j);
           }
           System.out.println();
       }
    }


    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollow_rectangle(int rown, int coln){
        for(int i=1; i<=rown; i++){
            for(int j=1; j<=coln;j++){
                if( i==1 || j==1 || i==rown || j==coln){
                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       hollow_rectangle(5,6);
       inverted_rotated_half_pyramid(4);
       inverted_half_pyramid(5); 
       floyedtriangle(8);
       zero_one_triangle(5);
       butterfly(4); 
       rhombus(5);
       diamond(4);
    }
}