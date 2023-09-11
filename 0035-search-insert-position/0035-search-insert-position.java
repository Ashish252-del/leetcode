class Solution {
    public int searchInsert(int[] nums, int target) {
           int low =0 ,high = nums.length-1;
        while(high>=low) {
            int m = (low+high)/2;
            if(nums[m] == target) return m;
            else if (nums[m] > target) high = m-1;
            else low = m+1;
        }
        if(low >= nums.length) return nums.length;
        if(high<0) return 0;
      if(nums[high] < target) return low ; 
        return high;
    }
}