public class substring{
    public static String sub_string(String str, int si, int ed){
        String substr = "";
        for(int i=si; i<ed; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]){
        String str = "helloWorld";
        System.out.print(str.substring(4,5));
       // System.out.print(sub_string(str,4,5));
    }
}