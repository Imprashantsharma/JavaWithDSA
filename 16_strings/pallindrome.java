public class pallindrome{
    public static boolean pallindrome_number(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                //not a pallindrome 
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "muum";
      System.out.print( pallindrome_number(str));
    }
}