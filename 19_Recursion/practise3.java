public class practise3{
    public static int StrngLen(String str){
      if(str.length() == 0){
          return 0;
      }
            //kaam
      int ans =  StrngLen( str.substring(1));
      
      return ans +1;


    }
    public static void main(String args[]){
        String str = ("prashant");
        System.out.println(StrngLen(str));
    }
}