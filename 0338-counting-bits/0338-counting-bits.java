class Solution {
    public int[] countBits(int n) {
        int ans [] = new int [n+1];
        ans[0] = 0;
        for(int i =1 ;i<=n; i++) ans[i] = cnt(i);
        return ans;
    }
    public int cnt (int num) {
        int curr = 0;
        int x = 1;
        while (num>0) {
            if((num&x) == 1) curr++;
           num = num>>1;
        }
        return curr;
    }
}