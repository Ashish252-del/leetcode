class Solution {
    public int search(int[] nums, int target) {
        int l =0, r = nums.length-1;
        while(r>=l) {
            int m = (l+r)/2;
            if(nums[m] == target) return m;
            if(nums[m]>=nums[l] ) {
               if ( target>=nums[l] && nums[m]>target)
              {  r = m-1;
               
               }
                else l = m+1;
            }
            
            else {
                 if ( target>nums[m] && nums[r]>=target)
              {   l = m+1;
               
                 }
                else r = m-1;
            }
        }
        return -1;
    }
}