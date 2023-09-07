class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int prev[] = new int [nums.length];
        prev[0] = nums[0];
        int ans = 0;
        int curr = prev[0];
        for(int i =1; i<nums.length; i++) 
         {  curr += nums[i];
            prev[i] = curr;}
        for(int i = 0; i<nums.length ; i++) {
            if(h.containsKey(prev[i]-k)) ans += h.get(prev[i]-k);
            if(prev[i] == k) ans++;
           if(h.containsKey(prev[i])){
               int t = h.get(prev[i]);
               h.put(prev[i], t+1);}
            else  h.put(prev[i], 1);
        }
        return ans ;
    }
}