class Solution {
    public int maxProfit(int[] prices) {
        int memo [][] = new int [prices.length][2];
            for (int j = 0; j<memo.length; j++) {
                Arrays.fill(memo[j],-1);
            }
        
        return solve(prices, 0, 1, memo);
    }
    
    public int solve(int[] prices , int i , int buy , int memo [][] ) {
        if(i >= prices.length ) return 0;
        if(memo[i][buy]!= -1) return memo[i][buy];
        if(buy == 1) {
   memo[i][buy] = Math.max((solve(prices,i+1,0,memo)-prices[i]),solve(prices,i+1,1,memo));
        }
        else {
  memo[i][buy] = Math.max((solve(prices,i+2,1,memo)+prices[i]),solve(prices,i+1,0,memo));
 
        }
        return memo[i][buy];
    }
}


// you may complete atmost 2 transactions 