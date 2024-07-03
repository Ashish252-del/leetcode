class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length ;
        Arrays.sort(nums);
        if(nums.length <= 4) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i<nums.length ; i++) {
            if(nums[i] - nums[i-1] < ans) {
                if(n-2 <= 3) ans = nums[i] - nums[i-1];
            }
        }
        int i =0;
        for (int j = n-4; j<n; j++) {
            if(ans > nums[j] - nums[i]) {
                ans = nums[j] - nums[i];
            }
            i++;
        }
        return ans;
    }
}