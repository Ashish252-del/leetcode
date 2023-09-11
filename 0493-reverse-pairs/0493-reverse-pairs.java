class Solution {
    int cnt = 0;
    public int reversePairs(int[] nums) {
       mergesort(nums , 0, nums.length -1);
        return cnt;
    }
    public void mergesort(int nums[] , int l, int r) {
        if(r>l) {
            int mid = (l+r)/2;
            mergesort(nums, l, mid);
            mergesort(nums, mid+1, r);
            count(nums, l , mid , r);
            merge(nums,l,mid,r);
        }
    }
    public void count(int nums[] , int l, int mid, int r) {
        int h = mid+1;
        for(int i =l; i<mid+1; i++) {
            int c =0;
            while(h<r+1 && nums[i]>(long)2*nums[h]) { h++;}
            cnt+=(h-(mid+1));
        }
    }
    public void merge (int nums [] , int l, int mid , int r) {
        int left [] = new int [(mid-l)+1]; int right[] = new int [r-mid];
        for(int i =0; i<left.length; i++) left[i] = nums[l+i];
           for(int i =0; i<right.length; i++) right[i] = nums[mid+(i+1)];
        int i =0 , j=0, k =l;
        while(i<left.length && j<right.length) {
            if(left[i] <= right[j]) {
                nums[k] = left[i]; i++; k++;
            }
        else {
             nums[k] = right[j]; j++; k++; 
        }
        }
        while(i<left.length) {nums[k] = left[i]; i++; k++;}
         while(j<right.length) {nums[k] = right[j]; j++; k++;}
        
    }
}