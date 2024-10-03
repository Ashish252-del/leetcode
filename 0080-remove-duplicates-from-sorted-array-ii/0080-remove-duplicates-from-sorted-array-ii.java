class Solution {
    public int removeDuplicates(int[] nums) {
       Map<Integer,Integer> h = new HashMap<>();
        int k = 0;
        for(int i =0; i<nums.length; i++) {
            if(!h.containsKey(nums[i])) h.put(nums[i],1);
            else h.put(nums[i], h.get(nums[i])+1);
            if(h.get(nums[i]) <=2){ nums[k] = nums[i]; k++;}
        }
            return k; 

    }
}