class Solution {
    public int maxProfit(int k, int[] prices) {
         int memo [][][] = new int [prices.length][2][k];
        for(int i =0 ;  i<memo.length; i++) {
            for (int j = 0; j<memo[i].length; j++) {
                Arrays.fill(memo[i][j],-1);
            }
        }
        return solve(prices, 0, 1, 0, memo,k);
    }
     public int solve(int[] prices , int i , int buy , int trans, int memo [][][], int k  ) {
        if(i == prices.length || trans >= k) return 0;
        if(memo[i][buy][trans] != -1) return memo[i][buy][trans];
        if(buy == 1) {
   memo[i][buy][trans] = Math.max((solve(prices,i+1,0,trans,memo,k)-prices[i]),solve(prices,i+1,1,trans,memo,k));
        }
        else {
  memo[i][buy][trans] = Math.max((solve(prices,i+1,1,trans+1,memo,k)+prices[i]),solve(prices,i+1,0,trans,memo,k));
 
        }
        return memo[i][buy][trans];
    }
}