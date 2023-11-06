class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
         int memo [][] = new int [matrix.length][matrix.length];
        for(int i =0; i<matrix.length; i++) {
            memo[matrix.length-1][i] = matrix[matrix.length-1][i];
        }
      
        for(int i = matrix.length-2; i>=0; i--) {
            for(int j =0; j<matrix.length; j++) {
                int mx = Integer.MAX_VALUE;
                if(j>0) mx = Math.min(mx,memo[i+1][j-1]);
                if(j<matrix.length-1)  mx = Math.min(mx,memo[i+1][j+1]);
                mx = Math.min(mx,memo[i+1][j]);
                memo[i][j] = matrix[i][j]+mx;
            }
        }
          for(int i =0; i<matrix.length; i++) {
             ans = Math.min(ans,memo[0][i]);
           // memo[matrix.length-1][i] = matrix[matrix.length-1][i];
        }
        return ans ;
    }
    public int solve(int[][] matrix, int r , int c , int memo[][] ){
        if(r>=matrix.length) return 100000;
        if(c>=matrix[r].length || c<0) return 100000;
        if(memo[r][c] != -1) return memo[r][c];
        if(r+1 == matrix.length ) {
          memo[r][c] = matrix[r][c];  return matrix[r][c];}
        int u = solve(matrix,r+1,c,memo);
        int l = solve(matrix,r+1,c+1,memo);
        int rd = solve(matrix,r+1,c-1,memo);
        memo[r][c] = matrix[r][c] + Math.min(Math.min(u,l),rd);
        return memo[r][c]; 
    }
    
}