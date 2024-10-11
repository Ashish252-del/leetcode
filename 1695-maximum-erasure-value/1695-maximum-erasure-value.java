class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int ans = 0;
        int curr =0;
        int l = 0; 
        HashSet<Integer> h = new HashSet<>();
        for (int i =0; i<nums.length; i++) {
            curr+=nums[i];
            if(!h.contains(nums[i])) h.add(nums[i]); 
            else 
                {while(h.contains(nums[i])) {
                    h.remove(nums[l]);
                    curr -= nums[l];
                    l++;
                }
               h.add(nums[i]);   
                }
            ans = Math.max(ans , curr);
        }
        return ans; 
    }
}