class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1) return ;
        k = k%nums.length;
        rotate(nums,nums.length-k, nums.length-1);
        rotate(nums,0,nums.length-k-1);
        rotate(nums,0,nums.length-1);
    }
    void rotate (int [] nums , int i , int j ) {
        while(j>i) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}