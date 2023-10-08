class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int memo [] = new int [nums.length+1];
        Arrays.fill(memo, -1);
        int cnt = 0;
        int a =  solve(nums, nums.length-1, memo, 1);
                 Arrays.fill(memo,-1);
        int b =   solve(nums, nums.length, memo,2 );
        return Math.max(a,b);
    }
    public int solve(int [] nums , int n, int memo[], int cnt ) {
         if(memo[n] != -1) return memo[n];
        if(n==cnt) {
            memo[cnt] = nums[n-1];
            return nums[n-1];
        }
        if(n<cnt) {
            memo[cnt-1] = 0;
            return 0;
        }
        memo[n] = Math.max(solve(nums,n-1,memo,cnt), solve(nums,n-2, memo,cnt) + nums[n-1]);
        return memo[n];
    }
}