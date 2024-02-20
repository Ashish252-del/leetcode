class Solution {
    public int missingNumber(int[] nums) {
         int a = 0; int b = 0;
        for(int i =0; i<=nums.length; i++)
            a = a^i;
        for(int i =0; i<nums.length; i++)
            b = b^nums[i];
        return a^b;
    }
}