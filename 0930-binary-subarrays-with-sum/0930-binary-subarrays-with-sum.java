class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int pre = 0; int curr = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i =0; i<nums.length; i++) {
            pre += nums[i];
            if(pre == goal) curr++;
            if(h.containsKey(pre - goal)) curr += h.get(pre-goal);
           if(h.containsKey(pre)) h.put(pre, h.get(pre)+1);
            else h.put(pre , 1);
        }
        return curr ;
    }
}