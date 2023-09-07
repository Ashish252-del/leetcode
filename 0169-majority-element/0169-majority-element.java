class Solution {
    public int majorityElement(int[] nums) {
       int res = 0, cnt =1;
        for(int i =1; i<nums.length; i++) {
            if(cnt==0) {res = i; cnt = 1;}
           else if(nums[i] == nums[res]) cnt++;
            else cnt --;
            
        }
        return nums[res];
    }
}