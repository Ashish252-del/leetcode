class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int cnt = 1;
        for(int i =n-2; i>=0; i--) {
            if(nums[i] != nums[i+1]) cnt++;
            if(cnt == 3) return nums[i];
        }
        return nums[n-1];
    }
}