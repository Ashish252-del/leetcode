class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0; int prev = 0;
        for(int i =1; i<prices.length; i++) {
            if(prices[i]>prices[prev]) {
                diff = Math.max(diff,prices[i]-prices[prev]);
                
            }
            else if(prices[i]<prices[prev]) prev = i;
        }
        return diff;
    }
}