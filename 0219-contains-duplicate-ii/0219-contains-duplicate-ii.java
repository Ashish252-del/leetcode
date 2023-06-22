class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();
        if(k==0) return false;
        for(int i =0; i<k && i<nums.length; i++) {
               if(h.contains(nums[i])) return true;
            else  h.add(nums[i]);
        }
        if(k>=nums.length) return false;
        for(int i =k; i<nums.length; i++) {
            if(h.contains(nums[i])) return true;
           else {h.remove(nums[i-k]); h.add(nums[i]);}
        }
        return false;
    }
}