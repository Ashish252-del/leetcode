class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        int ans =1;
        for(int i =1; i<nums.length; i++) {
            if(nums[i] == nums[prev]) {
                continue;
            }
            else {nums[prev+1] = nums[i]; ans++; prev++;}
        }
        return ans;
    }
}