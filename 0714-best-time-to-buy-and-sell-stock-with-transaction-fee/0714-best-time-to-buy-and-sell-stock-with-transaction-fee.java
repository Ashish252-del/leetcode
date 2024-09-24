class Solution {
    public int maxProfit(int[] prices, int fee) {
         int memo [][] = new int [prices.length][2];
            for (int j = 0; j<memo.length; j++) {
                Arrays.fill(memo[j],-1);
            }
        
        return solve(prices, 0, 1, memo,fee);
    }
     public int solve(int[] prices , int i , int buy , int memo [][],int fee ) {
        if(i >= prices.length ) return 0;
        if(memo[i][buy]!= -1) return memo[i][buy];
        if(buy == 1) {
   memo[i][buy] = Math.max((solve(prices,i+1,0,memo,fee)-prices[i]),solve(prices,i+1,1,memo,fee));
        }
        else {
  memo[i][buy] = Math.max((solve(prices,i+1,1,memo,fee)+(prices[i]-fee)),solve(prices,i+1,0,memo,fee));
 
        }
        return memo[i][buy];
    }
}