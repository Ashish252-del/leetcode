class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length+1;;
        long memo [][] = new long [n][amount+1];
        for(int i =0; i<=amount; i++) {
            if(i%coins[0] ==0 ) memo[0][i] = amount/coins[0] ;
            else  memo[0][i] = Integer.MAX_VALUE ;
        }
        for(int i =0; i<n; i++) {
             memo[i][0] = 0;;
        }
        for(int i =1; i<n; i++) {
            for(int j =1; j<=amount; j++) {
              long nc =  memo[i-1][j];
             long inc = Integer.MAX_VALUE; 
                if(j>=coins[i-1])
                {  inc = 1+memo[i][j-coins[i-1]];
               }
                memo[i][j] = Math.min(nc,inc);
            }
        }
        if(memo[n-1][amount]>=Integer.MAX_VALUE) return -1;
        return (int)memo[n-1][amount];
      // ans =  countWays(coins,amount,coins.length, memo);
      //   if(ans >=Integer.MAX_VALUE) return -1;
      //   return (int)ans;
    }
//     public long countWays (int [] coins, int amount , int n, long memo[][] ) {
//                 if(n==1) {
//                     if(amount%coins[n-1]==0) memo[n-1][amount] = amount/coins[n-1];
//                    else  memo[n-1][amount] = Integer.MAX_VALUE;
//                     return memo[n-1][amount];
//                 }
//         long nc =  countWays(coins,amount,n-1,memo);
//         long inc = Integer.MAX_VALUE;
//         if(amount>=coins[n-1]) inc = 1+countWays(coins,amount-coins[n-1], n,memo);
            
//         memo[n][amount] =  Math.min(inc,nc);
       
//         return memo[n][amount] ;
//     }
} 