class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int a = kedane(nums);
        int sum =0; 
        int allneg = 0;
        for(int i =0; i<nums.length; i++){ sum+=nums[i]; if(nums[i]<0) allneg++;}
         for(int i =0; i<nums.length; i++) nums[i] = 0-nums[i];
        if(allneg == nums.length) return a;
        int b = kedane(nums);
        return Math.max(a, sum+b);
    }
    
    public int kedane(int [] nums) {
        int prev = nums[0];
        int ans = prev;
    for(int i =1; i<nums.length; i++) {
     if(prev>0) prev = prev+nums[i];
        else prev = nums[i];
        ans = Math.max(ans,prev);
    }
        return ans;
    }
}