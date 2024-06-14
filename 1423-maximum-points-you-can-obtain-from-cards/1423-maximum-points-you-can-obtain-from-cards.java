class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        int l = 0;
        int r = 0;
        for(int i =0; i<k; i++) 
            l+=cardPoints[i];
        ans = l;
        for(int i = k-1; i>=0; i--) {
            l-=cardPoints[i];
            r += cardPoints[cardPoints.length  - k + i];
            ans = Math.max(r+l,ans);
        }
        return ans ;
    }
}