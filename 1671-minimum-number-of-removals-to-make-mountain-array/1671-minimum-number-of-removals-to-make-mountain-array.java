class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int lcs1 [] = new int [nums.length];
        int lcs2 [] = new int [nums.length];
        fillArray(nums,lcs1);
        reverseArray(nums, 0, nums.length-1);
         fillArray(nums,lcs2);
        int ans =0;
        for(int i =0; i<nums.length; i++) {
            if(lcs1[i] !=1 && lcs2[(nums.length -1)-i]!=1)
          {  ans = Math.max((lcs1[i]+lcs2[(nums.length -1)-i])-1, ans);}
        }
        return nums.length - ans  ;
    }
    public void fillArray(int []nums , int [] lcs) {
        lcs[0] = 1;
        for(int i = 1; i<nums.length; i++) {
            lcs[i] = 1;
            for(int j =0; j<i; j++) {
                if(nums[i] > nums[j]) {
                    lcs[i] = Math.max(lcs[i], 1+lcs[j]);
                }
            }
        }
    }
     public void reverseArray (int arr[], int l , int r ) {
         while(l<r) {
             int temp = arr[l];
             arr[l] = arr[r];
             arr[r] = temp;
             l++; r--;
         }
     }
}