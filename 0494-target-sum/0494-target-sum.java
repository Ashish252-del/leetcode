class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, nums.length, target , 0);
    }
    
    public int solve(int [] nums, int n , int target , int curr ) {
        if(n<0) return 0;
        if(curr == target && n==0 ) return 1;
         if(curr != target && n==0 ) return 0;
        int p = solve(nums,n-1,target, curr+nums[n-1]);
        int s = solve(nums,n-1,target, curr-nums[n-1]);
        return p+s;
    }
}