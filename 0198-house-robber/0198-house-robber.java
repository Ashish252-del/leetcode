class Solution {
    public int rob(int[] nums) {
        int memo [] = new int [nums.length+1];
        Arrays.fill(memo, -1);
        return solve(nums, nums.length, memo);
    }
    public int solve(int [] nums , int n, int memo[]) {
        if(memo[n] != -1) return memo[n];
        if(n==1) {
            memo[1] = nums[0];
            return nums[0];
        }
        if(n<=0) {
            memo[0] = 0;
            return 0;
        }
        memo[n] = Math.max(solve(nums,n-1,memo), solve(nums,n-2, memo) + nums[n-1]);
        return memo[n];
    }
}