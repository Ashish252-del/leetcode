class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
       HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            if(m.containsKey(nums[i])) m.put(nums[i],m.get(nums[i])+1);
            else m.put(nums[i],1);
        }
         for (Integer url : m.values()) {
           if(url>1) ans = ans + math(url);
         }
        return ans;
    }
    int math (int a ){
        int x = ((a*(a-1))/2);
        return x;
    }
}