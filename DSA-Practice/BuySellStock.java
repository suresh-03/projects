public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,0,2,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
    int profit = 0;
    int s = 0;
    int e = s+1;
    for(int i = 0; i < prices.length; i++){
        if(e < prices.length){
             if(prices[s] > prices[e]){
            s = e;
            e++;
        }
        else if(prices[s] < prices[e]){
            if(profit < prices[e] - prices[s]){
                profit = prices[e] - prices[s];
            }
            e++;
        }
        else{
            e++;
        }
        }
       
    }
    return profit;
}
}