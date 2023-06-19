class Solution {
    public int largestAltitude(int[] gain) {
            int prev = gain[0],  att = 0;
      //  gain[0] = 0;
        int ans = 0;
        ans = Math.max(ans,ans+gain[0]);
        for(int i =1; i<gain.length; i++) {
            gain[i] += prev;
            prev = gain[i];
            ans = Math.max(ans,prev);
        }
        return ans;
    }
}