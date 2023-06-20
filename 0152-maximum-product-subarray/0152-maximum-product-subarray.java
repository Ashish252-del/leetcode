class Solution {
    public int maxProduct(int[] nums) {
        int prev = 1, suff =1, ans = Integer.MIN_VALUE;
        int prod = 1;
        for(int i =0; i<nums.length; i++) {
            prev *= nums[i]; suff*=nums[nums.length-1-i];
            ans = Math.max(ans,Math.max(prev,suff));
            if(prev==0) prev = 1;
            if(suff==0) suff = 1;
        }
        return ans ;
    }
}