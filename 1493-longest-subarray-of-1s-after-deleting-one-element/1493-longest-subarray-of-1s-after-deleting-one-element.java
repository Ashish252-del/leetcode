class Solution {
    public int longestSubarray(int[] nums) {
        int zeroIndx = -1;
        int l =0;
        int ans = 0;
        for(int i =0; i<nums.length; i++) {
            if(nums[i] ==0 && zeroIndx !=-1) {
             l = zeroIndx+1;
             zeroIndx = i;   
            } 
            else if (nums[i] == 0 && zeroIndx == -1){
                zeroIndx = i;
            }
            
            ans = Math.max(ans,i-l);
        }
        return ans ;
    }
}