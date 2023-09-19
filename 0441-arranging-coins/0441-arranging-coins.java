class Solution {
    public int arrangeCoins(int n) {
       int res = 1; int cnt = 0;
        while(n>=res) {
            n = n-res;
            res = res+1;
            cnt++;
        }
        return cnt;
    }
}