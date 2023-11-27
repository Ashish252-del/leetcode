class Solution {
    int nums [];
    public int splitArray(int[] nums, int k) {
        this.nums = nums ;
        int mx = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        int sum =0;
      for(int i =0; i<nums.length ; i++) {
          mx = Math.max(mx,nums[i]);
          sum+=nums[i];
      }
        if(k ==nums.length) return mx;
        if(k==1) return sum;
        
        while(mx<=sum) {
            int mid = (mx+sum)/2;
            if(pos(mid,k)) {ans=Math.min(ans,mid); sum = mid-1;} 
            else mx = mid+1;
        }
       return ans ; 
    }
    public boolean pos (int m, int k) {
        int curr = nums[0]; int cnt = 0;
        for(int i =1; i<nums.length; i++) {
          if(m>=curr+nums[i])  curr+=nums[i];
           else {cnt++; curr = nums[i];}
        } 
        if(curr<=m) cnt++;
        return cnt<=k;
    }
}