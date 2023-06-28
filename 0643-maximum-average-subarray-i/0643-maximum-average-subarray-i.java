class Solution {
    public double findMaxAverage(int[] nums, int k) {
      //  if(k==1 && nums.length==1) return nums[0];
        double ans = Integer.MIN_VALUE;
        double avg =0;
        for(int i =0; i<k; i++) avg += nums[i];
       for(int i = k; i<nums.length; i++) {
         ans = Math.max(ans,avg);
          avg = (avg - nums[i-k]) + nums[i]; 
       }
        ans = Math.max(ans,avg);
      return ans/k ;  
    }
}