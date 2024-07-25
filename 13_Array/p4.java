public class p4{
    public static void trappingrainwater(int height[]){
       
        // left most boundary - array
        int LeftMost[] = new int[height.length];
        LeftMost[0] = height[0];
        for(int i=1; i<height.length; i++){
            LeftMost[i] = Math.max(height[i],LeftMost[i-1]);
        }

        //right most boundary - array
         int RightMost[] = new int[height.length];

         RightMost[height.length-1] = height[height.length-1];
         for(int i=height.length-2; i>=0; i--){
             RightMost[i] = Math.max(height[i],RightMost[i+1]);
         }

        // for
        int trappedwater = 0;
        for(int i=0; i<height.length; i++){
            int waterlevel = Math.min( LeftMost[i], RightMost[i]);
            trappedwater += waterlevel - height[i];
        }
        System.out.println(" the trappedwater is "+ trappedwater);
     //   return trappedwater;
    }
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trappingrainwater(height);
    } 
}