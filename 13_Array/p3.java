public class p3{
    public static int stocks(int prices[]){
        int BuyPrice= Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if( BuyPrice< prices[i]){
                int profit = prices[i] - BuyPrice;
                MaxProfit = Math.max( MaxProfit , profit);
            }else{
                BuyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        System.out.print(stocks(prices));
     }
}