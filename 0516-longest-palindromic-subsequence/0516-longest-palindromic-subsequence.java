class Solution {
    public int longestPalindromeSubseq(String s) {
         StringBuilder d = new StringBuilder();
          d.append(s);
          d.reverse();
        int n = s.length();
        int memo [][] = new int [n+1][n+1];
        for(int i =0; i<=n; i++) {memo[i][0] = 0; memo[0][i]=0;}
        for(int i =1; i<=n; i++) {
            for(int j =1; j<=n; j++) {
                if(s.charAt(i-1)==d.charAt(j-1)) memo[i][j] = 1+memo[i-1][j-1];
                else memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
            }
        }
        return memo[n][n];
    }
}