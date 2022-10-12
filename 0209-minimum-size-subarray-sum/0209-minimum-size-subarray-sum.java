class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int i=0, j=0, sum=0, ans=nums.length+1;
        while(j<nums.length){
            sum+=nums[j++];
            while(sum>=target){
                ans=Math.min(ans, j-i);
                sum-=nums[i++];
            }
        }
        return ans%(nums.length+1);
    }
}