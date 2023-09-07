class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> h = new HashMap<>();
        int ans [] = new int [2];
        for(int i =0; i<nums.length; i++) {
            if(h.containsKey(target - nums[i])) {ans[0] = h.get(target - nums[i]); ans [1] = i; break;}
            h.put(nums[i] , i);
        }
        return ans ;
    }
}