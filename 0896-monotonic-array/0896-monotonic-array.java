class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2 ) return true ; 
        int i = 1;
        while(i < nums.length && nums[i] == nums[i-1]) i++;
        if(i == nums.length ) return true ;
          boolean c = false ; 
        if(nums[i] > nums[i-1])  c = true ;
        for ( ; i<nums.length ; i++) {
            if(nums[i] == nums[i-1]) continue ;
            boolean curr = false ; 
            if(nums[i] > nums[i-1]) curr = true ;
            if(c != curr) return false;
        }
        return true ; 
    }
}