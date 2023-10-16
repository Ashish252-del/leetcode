class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i =0; i<nums.length; i++) {
            if(h.containsKey(nums[i])) h.put(nums[i], h.get(nums[i])+1);
           else h.put(nums[i],1);}
        for(int i =0; i<nums.length; i++) {
            if(h.get(nums[i])>1) continue;
            if(!(h.containsKey(nums[i]-1) || h.containsKey(nums[i]+1))) ans.add(nums[i]);
        }
        return ans ; 
    }
}