class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0) return false;
        if(n==-2147483648) return false;
     int curr = n; 
        curr = curr&(curr-1);
       if(curr!=0) return false;
        return true;
    }
}