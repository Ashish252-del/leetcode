class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length() , n= text2.length();
        int memo [][] = new int [m+1][n+1];
        for(int i =0; i<memo.length; i++) Arrays.fill(memo[i],-1);
        return lsc(text1,text2,m,n, memo);
    }
  public int lsc (String a, String b, int m, int n, int memo [][]) {
      if(memo[m][n]!=-1) return memo[m][n];
        if(n==0 || m==0) {memo[m][n] = 0;}
       else if(a.charAt(m-1) == b.charAt(n-1)) memo[m][n] = 1 + lsc(a,b,m-1,n-1, memo);
       else memo[m][n] = Math.max(lsc(a,b,m,n-1, memo), lsc(a,b,m-1,n, memo));
      return memo[m][n];
    }
}