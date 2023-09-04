class Solution {
    public int jump(int[] nums) {
        int memo [] = new int [nums.length+1];
        Arrays.fill(memo, -1);
        return minJump(nums,nums.length, memo);
    }
    
    public int minJump(int [] nums, int n , int memo []) {
        if(n ==0 || n==1)  {memo[n] = 0; return 0;}
        if(memo[n] != -1) return memo[n];
        int res = Integer.MAX_VALUE;
        for(int i = n-2 ; i>=0; i--) {
             int sub = res;
            if(nums[i] + i>=n-1) {
                 sub = minJump(nums, i+1, memo) +1 ;
            }
            //if(sub != Integer.MAX_VALUE)
           res = Math.min(sub, res);
        }
        memo[n] = res ; 
        return res;
    }
}