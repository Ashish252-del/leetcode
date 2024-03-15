class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        int l = nums[0];
        for(int i =1; i<nums.length-1; i++) {
            ans[i] = l;
            l*=nums[i];
        }
        ans[nums.length-1] = l;
        int r = nums[nums.length-1];
        for(int i = nums.length-2; i>0; i--) {
            ans[i] = ans[i]*r;
            r*=nums[i];
        }
        ans[0] = r;
        return ans ;
    }
}