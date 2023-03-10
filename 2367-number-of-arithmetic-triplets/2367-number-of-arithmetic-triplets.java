class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
      HashSet<Integer> s = new HashSet<>();
        int  ans = 0;
     for (int i =0; i<nums.length; i++) {
       if(s.contains(nums[i]-diff)&&s.contains(nums[i]-(2*diff))) ans++;
         s.add(nums[i]);
     }   
      return ans;  
    }
}