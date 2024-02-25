class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        int minimum = prices[0];
        for(int i =0;i<prices.length;i++){
            minimum =Math.min(minimum,prices[i]);
            int profit = prices[i]-minimum;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
}