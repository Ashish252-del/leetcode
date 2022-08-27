class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans [] = new int[2];
        ans[0] = findex(nums,target);
        ans[1] = lindex(nums,target);
        return ans;
    }
    
    int findex (int [] arr, int x) {
        int l = 0, r = arr.length-1;
        while(r>=l) {
            int m = (l+r)/2;
            if(arr[m]==x&&(m==0||arr[m-1]!=x)) return m;
            if(arr[m]==x||arr[m]>x) r = m-1;
            else l = m+1;
        }
        return -1;
    }
     int lindex (int [] arr, int x) {
        int l = 0, r = arr.length-1;
        while(r>=l) {
            int m = (l+r)/2;
            if(arr[m]==x&&(m==arr.length-1||arr[m+1]!=x)) return m;
            if(arr[m]==x||arr[m]<x) l = m+1;
            else r = m-1;
        }
        return -1;
    } 
}