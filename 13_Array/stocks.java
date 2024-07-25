public class stocks{
    public static int sellstocks(int prices[]){
    
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i =1; i<prices.length; i++){
              if( BuyPrice < prices[i] ){
                  int profit = prices[i] - BuyPrice;
                  MaxProfit = Math.max(MaxProfit, profit);
              } else{
                  BuyPrice = prices[i];
              }
        }
        return MaxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print(sellstocks(prices));
    }
}