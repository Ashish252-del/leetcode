class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true ;
     int mxIndx = 0;
        for(int i =0; i<nums.length; i++) {
            if(i+nums[i] > mxIndx) mxIndx = i+nums[i];
            if(i == mxIndx && nums[i] == 0) return false;
            if(mxIndx >=nums.length-1) return true;
        }
        return false;
    }
   
}