class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l =0, h = nums.length-1;
        if(nums.length==1) return nums[0];
        while(l<=h) {
            int m = (l+h)/2;
            if( nums[l] !=nums[l+1]) return nums[l];
            if( nums[h] !=nums[h-1]) return nums[h];
            if (nums[m]!=nums[m+1] && nums[m-1]!=nums[m]) return nums[m];
            h=h-2;
            l=l+2;
        }
        return -1;
    }
}