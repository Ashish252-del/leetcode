class Solution {
    public double myPow(double x, int n) {
        long p = n;
        boolean pos = (n>0);
        if (!pos) p=0-p;
        boolean num = x>0;
        boolean even = (p%2==0);
        double ans = 1;
        if(p==0) return ans ;
        
      while (p>=1) {
          if(p%2!=0) ans = ans*x;
          x=x*x;
           p=p/2;
      }
        if(pos) return ans;
       return 1/ans;
    }
}