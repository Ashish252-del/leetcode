class Solution {
    public int[] countBits(int n) {
      int ans [] = new int[n+1];
       for(int i =1; i<n+1; i++){
           ans[i] = count(i);
       }
        return ans;
    }
    int count(int x){
        int cnt = 0;
        while(x>0){
            x=x&(x-1); cnt++;
        }
        return cnt;
    }
}