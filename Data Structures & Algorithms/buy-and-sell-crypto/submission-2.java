class Solution {
    public int maxProfit(int[] prices) {
        int purchase=0;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++){
         if(prices[i] < prices[purchase]){
            purchase = i;
         }
         int profit = prices[i]-prices[purchase];
         maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
