class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long res = 0;
        int l =0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            ans+=nums[i];
            int newL = -1;
            while(mp.containsKey(nums[i])) {mp.remove(nums[l]);
                ans-=nums[l];
                l++;}
             mp.put(nums[i],i);
            while(mp.size()>k ) {
                mp.remove(nums[l]);
                ans-=nums[l];
                l++;
            }
            if(mp.size() == k) res = Math.max(ans,res);
        }
        return res;
    }
}