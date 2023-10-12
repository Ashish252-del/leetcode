class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for(int i =0; i<weights.length; i++) sum+=weights[i];
        int l = 1;
        int mid = 0;
        int ans = 0;
        while(sum>=l) {
             mid  = (l+sum)/2;
            if(canConvay(weights,mid,days)) {
                sum = mid -1;
                ans = mid ; 
            }
            else l = mid+1;
        }
        // if(canConvay(weights,2,days)) {
        //          ans = 2;
        //      }
        return ans ;
    }
    boolean canConvay(int [] w, int sum ,int days) {
        int cnt =0; int curr =0; 
        for(int i =0; i<w.length; i++) {
            curr += w[i];
            if(curr>sum) {
                cnt++;
                curr = w[i];
                if(curr>sum) return false;
            }
        }
        if(curr<=sum) cnt++;
        if(cnt <= days) return true ;
        return false; 
    }
}