class Solution {
    public void nextPermutation(int[] nums) {
            int breakIndex = -1;
        int n = nums.length ;
        for(int i = n-2; i>=0; i--) {
            if(nums[i]<nums[i+1]) {breakIndex = i; break;}
        }
        if(breakIndex == -1) {Arrays.sort(nums); return;}
        int min = 101; int index = -1;
        for(int i =breakIndex+1; i<nums.length; i++) {
           if(min>=nums[i] && nums[i] >nums[breakIndex]) {min = nums[i]; index = i;}
        }
        int temp = nums[breakIndex];
        nums[breakIndex] = nums[index];
        nums[index] = temp;
        reverse(nums, breakIndex+1, n-1);
    }
    
    public void reverse(int nums [] , int l ,int  r) {
        while (r>l) {
           int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;  
            r--; l++;
        }
    }
}