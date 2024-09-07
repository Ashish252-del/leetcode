class Solution {
    int ans = 0;
    public int change(int amount, int[] coins) {
        int memo [][] = new int [amount +1][coins.length];
        for(int i =0 ; i<coins.length; i++) memo[0][i] = 1;
        for( int i = 1; i<memo.length; i++) {
            for(int j =0; j<coins.length; j++) {
               if(j>0) memo[i][j] += memo[i][j-1];
                if(i-coins[j]>=0) memo[i][j] += memo[i-coins[j]][j];
            }
        }
        return memo[amount][coins.length-1];
     //  return solve(amount , coins , coins.length-1, memo);
       // return ans;
        
    }
    int solve (int am , int cns [] , int i , int memo [][]) {
        if(am<0 || i<0) return 0;
        if(memo[am][i] != 0) return memo[am][i];
        if(am == 0) {  memo[0][i] = 1; return 1;}
       int a = solve(am- cns[i] , cns, i, memo);
       int b = solve(am, cns, i-1, memo);
       memo[am][i] = a+b;
       return memo[am][i];
    }
}