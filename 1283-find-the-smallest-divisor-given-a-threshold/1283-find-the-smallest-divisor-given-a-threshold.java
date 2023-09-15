class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
       int l = 1 , r=nums[nums.length-1];
        int ans = Integer.MAX_VALUE;
       while(r>=l) {
           int m = (l+r)/2;
           if(Isposs(nums,m,threshold)) {
               ans = Math.min(ans,m);
               r = m-1;
           }
           else { l = m+1;}
       } 
        return ans ;
    }
    boolean Isposs( int arr [] , int k,  int threshold) {
        int ans = 0;
        for(int i =0; i<arr.length; i++) {
            ans+= (arr[i]/k);
            if(arr[i]%k !=0) ans++;
        }
        return (ans<=threshold);
    }
}