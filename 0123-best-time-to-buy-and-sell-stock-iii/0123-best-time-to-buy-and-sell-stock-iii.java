class Solution {
    public int maxProfit(int[] prices) {
        int memo [][][] = new int [prices.length][2][3];
        for(int i =0 ;  i<memo.length; i++) {
            for (int j = 0; j<memo[i].length; j++) {
                Arrays.fill(memo[i][j],-1);
            }
        }
        return solve(prices, 0, 1, 0, memo);
    }
    
    public int solve(int[] prices , int i , int buy , int trans, int memo [][][] ) {
        if(i == prices.length || trans >= 2) return 0;
        if(memo[i][buy][trans] != -1) return memo[i][buy][trans];
        if(buy == 1) {
   memo[i][buy][trans] = Math.max((solve(prices,i+1,0,trans,memo)-prices[i]),solve(prices,i+1,1,trans,memo));
        }
        else {
  memo[i][buy][trans] = Math.max((solve(prices,i+1,1,trans+1,memo)+prices[i]),solve(prices,i+1,0,trans,memo));
 
        }
        return memo[i][buy][trans];
    }
}


// you may complete atmost 2 transactions 