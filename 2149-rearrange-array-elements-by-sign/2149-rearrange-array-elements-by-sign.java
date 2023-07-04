class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a [] = new int [nums.length/2];
        int b[] = new int [nums.length/2];
        int i =0, j=0;
        for(int k =0; k<nums.length; k++) {
            if(nums[k]<0) {a[i] = nums[k]; i++;}
            else {b[j] = nums[k]; j++;}
        } i=0; j=0;
         for(int k =0; k<nums.length; k++){
            if(k%2==0) {nums[k] = b[j]; j++;}
             else {nums[k] = a[i]; i++;}
         }
        return nums;
    }
}