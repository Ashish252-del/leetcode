class Solution {
    public int lengthOfLIS(int[] nums) {
        int lcs [] = new int [nums.length];
        lcs[0] = 1;
        for(int i =1; i<nums.length; i++) {
            lcs[i] = 1;
            for(int j =0; j<i; j++) {
                if(nums[i]>nums[j]) lcs[i] = Math.max(lcs[i], lcs[j]+1);
            }
        }
        int res = lcs [0];
        for(int i =1; i<lcs.length; i++) {
          res = Math.max(lcs[i], res);
        }
        return res;
    }
}