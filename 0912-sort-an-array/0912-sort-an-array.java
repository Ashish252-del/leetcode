class Solution {
    public int[] sortArray(int[] nums) {
      Arrays.sort(nums);
      int ans [] = new int [nums.length];
      for(int i=0; i<nums.length; i++)
      ans[i] = nums[i];
      return ans;  
    }
}




