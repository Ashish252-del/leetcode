class Solution {
    public int majorityElement(int[] nums) {
       int res = 0, cnt =1;
        for(int i =1; i<nums.length; i++) {
            if(nums[i] == nums[res]) cnt++;
            else cnt --;
            if(cnt==0) {res = i; cnt = 1;}
        }
        return nums[res];
    }
}