public class tiling{
    public static int TillingProcess(int n){
       if( n==0 || n==1){
           return 1;
       }
       // for vertically
       int fnm1 = TillingProcess(n-1);

       // for horizontally
       int fnm2 = TillingProcess(n-2);

       int TotalWays = fnm1 + fnm2;
       return TotalWays;
    }
    public static int FriendsPairing(int n){
       //base case
       if(n==1||n==2){
           return n;
       }
     /*  //for single
       int Fnm1 = FriendsPairing(n-1);

       //for pairing 
       int Fnm2 = FriendsPairing(n-2);
       int pairWAYS = (n-1) * Fnm2;

       // total ways 
       int totalWays = Fnm1 + pairWAYS;      */

       return FriendsPairing(n-1) + (n-1)* FriendsPairing(n-2);
    }


    public static void removeDuplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        //base case
         if(idx == str.length()){
             System.out.println(newstr);
             return;
         }

         //kaam
          
         char currChar = str.charAt(idx);
         if(map[currChar - 'a'] == true){
             //duplicate
             removeDuplicate(str, idx+1, newstr,map);
         }else{
             map[currChar-'a'] = true;
             removeDuplicate(str, idx+1, newstr.append(currChar), map);
         }
    }

    public static void PrintBinString(int n, int LastPlace, String str){
        
        // Base case
        if( n == 0){
            System.out.println(str);
            return;
        }

        //kaam
         PrintBinString(n-1,0,str+0);
        if(LastPlace == 0){
            PrintBinString(n-1,1,str+1);
        }
    }


    public static void main(String args[]){
      /*  String str = "sonupandit";
        StringBuilder newstr = new StringBuilder("");
        boolean map[] = new boolean[26];
        removeDuplicate(str,0, newstr , map);*/


        PrintBinString(3,0,"");
      
        
    }
}