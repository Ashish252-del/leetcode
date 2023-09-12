class Solution {
    public boolean search(int[] nums, int target) {
         int l =0, r = nums.length-1;
        while(r>=l) {
            int m = (l+r)/2;
            if(nums[m] == target) return true;
            while(nums[m] == nums[l] && (l!=m)) l++;
          while(nums[m] == nums[r] && (r!=m)) r--;

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
        return false;
    }
}