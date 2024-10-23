class Solution {
    public int minimumSum(int[] nums) {
        int ans =Integer.MAX_VALUE;
        int lmin [] = new int [nums.length];
        int rmin [] = new int [nums.length];
        lmin[0] = nums[0];
        rmin[nums.length-1] = nums[nums.length-1];
        for(int i = 1; i<nums.length; i++) {
          lmin[i] = Math.min(lmin[i-1], nums[i]); 
        }
         for(int i = nums.length-2; i>=0; i--) {
          rmin[i] = Math.min(rmin[i+1], nums[i]); 
        }
        for(int i = 1; i<nums.length-1; i++) {
           if(nums[i] > lmin[i] && nums[i]>rmin[i]) {
               ans = Math.min(ans , nums[i] + lmin[i] + rmin[i]);
           }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}