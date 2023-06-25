class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, ans =0, zero=0;
        for(int i =0; i<nums.length; i++) {
           // ans = Math.max(i-start+1, ans);
            if(nums[i]==0) zero++;
            while( zero >k){
                if(nums[start]==0) zero--;
                start++;}
              ans = Math.max(i-start+1, ans);
        }
        return ans ;
    }
}