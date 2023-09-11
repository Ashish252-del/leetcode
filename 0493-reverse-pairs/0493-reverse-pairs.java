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
    public void merge (int arr [] , int low, int mid , int high) {
       ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        
    }
}