class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
        int ans = 0;
        for(int i =0; i<nums.length; i++) {
               if(s.containsKey(nums[i])) s.put(nums[i] , s.get(nums[i])+1);
              else s.put(nums[i],1);
          
        }
        for(Map.Entry<Integer,Integer> e : s.entrySet()) {
              int t1 = e.getKey()-k ;
            if(s.containsKey(t1)){ ans+=( s.get(t1))*(e.getValue()); }
         
        }
        return ans;
    }
}