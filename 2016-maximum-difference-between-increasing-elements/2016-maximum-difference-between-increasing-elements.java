class Solution {
    public int maximumDifference(int[] nums) {
       int diff = -1, prev = 0;
        for(int i =1 ; i<nums.length; i++ ){
            if(nums[i]>nums[prev])
              {  diff = Math.max(diff,nums[i]-nums[prev]);
            }
            else if(nums[i]<nums[prev]) prev = i;
        }
        return diff;
    }
}