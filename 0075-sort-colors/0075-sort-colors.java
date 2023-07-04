class Solution {
    public void sortColors(int[] nums) {
       // Using Dutch National Flag Algorithm 
        int l =0, m=0 , h = nums.length-1;
        while(h>=m) {
            if(nums[m] ==0) {
                int temp = nums[m];
                nums[m] = nums[l];
                nums[l] = temp;
                l++; m++;
            }
            else if (nums[m] == 1) m++;
            else {
                 int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                h--;
            }
        }
    }
}