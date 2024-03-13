class Solution {
    public int pivotInteger(int n) {
        if(n == 1) return n ;
      int l = 1, r= n;
        int s = (n*(n+1))/2;
        for(int i =2; i<=n; i++) {
           if(l == ((s-i)-l)) return i;
            l+=i;
        }
        return -1;
    }
}