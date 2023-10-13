class Solution {
    public int uniquePaths(int m, int n) {
        int memo [] [] = new int [m+1][n+1];
        for(int i =0; i<m ; i++) Arrays.fill(memo[i],-1);
       return solve(m,n,0,0, memo);
    }
    
    public int solve (int m , int n, int i , int j , int memo[][]) {
        if(memo[i][j] != -1) return memo[i][j];
       if(i==m-1 && j == n-1){ memo[i][j] = 1; return 1;}
        if(i>=m || j>=n) {memo[i][j] = 0; return 0;}
        int ans = 0;
        ans = solve(m,n,i+1,j,memo) + solve(m,n,i, j+1, memo);
        memo[i][j] = ans;
        return ans;
    }
}