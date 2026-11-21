class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int high = 0, low = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < low) {
                low = prices[i];
                high = prices[i];
            }

            if(prices[i] > high) {
                high = prices[i];
            }

            int profit = high - low;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
