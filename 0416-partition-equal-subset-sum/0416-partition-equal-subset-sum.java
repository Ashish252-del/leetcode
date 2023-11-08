class Solution {
    public boolean canPartition(int[] nums) {
       int sum = 0;
        for (int i =0; i<nums.length; i++) sum+=nums[i];
        if((sum%2) !=0) return false;
        sum /=2;
        int memo [][] = new int [nums.length][sum+1] ;
        for(int i =0; i<memo.length; i++) Arrays.fill(memo[i], -1);
       return solve(nums, sum, nums.length-1, memo);
    }
    
    boolean solve (int [] nums, int target , int i , int [][] memo) {
        if(memo[i][target] != -1) {
            if(memo[i][target] == 1) return true ;
            return false ;
        }
        if(target == 0){
           memo[i][target] = 1; 
            return true;}
        if(i ==0){
            if(target == nums[0]) memo[i][target] = 1;
            else memo[i][target] = 0;
            return (target == nums[0]);}
        boolean take = false;
      if(target>=nums[i])    take = solve(nums,target-nums[i], i-1, memo);
        boolean non = solve(nums,target, i-1, memo);
       if(take || non) memo[i][target] = 1;
        else memo[i][target] = 0;
        return take || non;
    }
}