class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int min = prices[0];
        int max = prices[0];
        for(int i = 1; i < prices.length; i++) {
            
            if(prices[i] < min) {
                min = prices[i];
                max = min;
            }

            if(prices[i] > max) {
                max = prices[i];
            } 
            
            maxprofit = Math.max(maxprofit, max - min);
        }

        return maxprofit;
    }
}