class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pr = 1;
        int l =0; int ans =0;
        for(int i =0 ; i<nums.length; i++) {
            pr = pr*nums[i];
            while(pr>=k && l<i) {
                pr = pr/nums[l];
                l++;
            }
            if(pr<k) ans +=  i-l+1;
        }
        return ans;
    }
}