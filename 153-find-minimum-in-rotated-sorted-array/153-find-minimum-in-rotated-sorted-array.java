class Solution {
    public int findMin(int[] nums) {
        int l =0, h = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(h>=l){
            int mid = (l+h)/2;
            if (nums[mid]>=nums[l]){ min = Math.min(min,nums[l]);
                                 l=mid+1;}
            else  if (nums[mid]<=nums[h]) { min = Math.min(min,nums[mid]);
                                 h=mid-1;}
            else {min = Math.min(min,nums[mid]); l++;h--;}
            
        }
        return min;
    }
}