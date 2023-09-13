class Solution {
    public int findMin(int[] nums) {
    int min = Integer.MAX_VALUE;
        int l =0, h = nums.length-1;
        while(l<=h) {
            int mid = (l+h)/2;
            min = Math.min(min , nums[mid]);
            if(nums[l]<=nums[mid]) {
                min = Math.min(min, nums[l]);
                l = mid+1;
            }
            else {
                min = Math.min(min, nums[mid]);
                h = mid-1; 
            }
        }
        return min;
    }
}