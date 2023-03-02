class Solution {
    public int minOperations(int[] nums) {
        int ans =0, temp = 0;
        for(int i =1; i<nums.length; i++){
          if(nums[i-1]>=nums[i])  {
              temp = nums[i-1] - nums[i];
              temp++; 
              nums[i] += temp;
              ans+= temp;
          }
        }
        return ans ;
    }
}