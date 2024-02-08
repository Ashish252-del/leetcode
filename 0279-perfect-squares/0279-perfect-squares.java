class Solution {
    public int numSquares(int n) {
        // max = integer.Max_vslue ; 
        if(n==0) return 0;
        if(isPerfectSquare(n)) return 1;
        int memo [] = new int [n+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        return count(n, memo);
    }
    
    public int count (int n, int memo []) {
       memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i<=n; i++) {
            if(isPerfectSquare(i)) {
               // if(memo[n-i] !=-1) memo[n] = Math.min(1+memo[n-i],memo[n]);
                memo[i] = 1;
            }
           else {
                for(int j = 4; j< i; j++)
                   { if(memo[j] == 1) {
                        memo[i] = Math.min(memo[i],(i/j) +memo[i%j]);
                    }}
              memo[i] =  Math.min(1+memo[i-1],memo[i]); }
        }
       return memo[n];
    }
    
    public boolean isPerfectSquare( int num ) {
        for (int i = 2; i*i<= num; i++) {
            if(i*i == num ) return true;
        }
        return false;
    }
}