class Solution {
      public long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long e = (n+1)/2;
        long o = (n/2);
        return (int)(pow(5,e)*pow(4,o)%1000000007);
      // return (int)(pow(5,even) * pow(4,odd) % 1000000007);
    }
    
    public long pow(long x, long n){
        
       if(n==0) return 1;
       if(n == 1) return x;
     //  if(n == -1) return 1/x;
       if(n%2 ==0) {
           long l = pow(x, n/2)%1_000_000_007;
           return (l*l)%MOD;
       }
       return x*pow(x, n-1)%1_000_000_007;
      // return (1/x)*pow(x, n+1)%1_000_000_007;
    }
}