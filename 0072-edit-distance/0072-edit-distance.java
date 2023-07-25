class Solution {
    public int minDistance(String word1, String word2) {
                int memo [][] = new int [word1.length()+1][word2.length()+1];
                 
        return mic(word1,word2,word1.length(),word2.length(), memo);
    }
    public int mic (String s1, String s2, int m , int n , int memo [][]) {
        if(memo[m][n] !=0) return memo[m][n];
        if(m==0) { memo[m][n] = n; return n ;}
        if(n==0) {memo[m][n] = m;return m;}
        if(s1.charAt(m-1)==s2.charAt(n-1)) memo[m][n] = mic(s1,s2,m-1,n-1,memo);
        else memo[m][n] =  1+ Math.min(Math.min(mic(s1,s2,m-1,n,memo), mic(s1,s2,m,n-1,memo)), mic(s1,s2,m-1,n-1,memo));
        return memo[m][n];
    }
}