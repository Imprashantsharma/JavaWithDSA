public class practise2{

     static  String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

   
    public static void NoToString(int num){
       if(num == 0){
           return;
       }
       int Lastdigit = num%10;
       NoToString(num/10);
       System.out.print(digits[Lastdigit]+" ");
    }


     public static void main(String args[]){
           NoToString(1947);
     }
}