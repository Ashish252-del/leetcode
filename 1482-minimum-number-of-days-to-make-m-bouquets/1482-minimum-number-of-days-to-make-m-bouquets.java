class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
      
         int b[] = bloomDay.clone();
        Arrays.sort(b);
          int l = b[0], r=b[bloomDay.length -1];
        if((k*m) > bloomDay.length) return -1;
        if(l==r) return r;
        int ans = -1;
        while(r>=l) {
            int mid = (l+r)/2;
            if(dayreq(bloomDay,mid,k,m)) {
                if(ans==-1) ans = mid;
               else ans = Math.min(mid,ans);
                r = mid-1;
            }
               else {
                   l = mid+1;
               }
               }
       return ans;
            //   return -1;
               }
             
               
    
    public boolean dayreq (int [] arr, int d, int k , int m ) {
        int ans = 0, curr = 0;
        for(int i =0; i<arr.length; i++) {
            if(arr[i]<=d) {curr++;
                if(curr == k) {ans++; curr = 0 ;} }
            else{
                 if(curr == k) ans++; 
             curr = 0 ;       
                }
            }
         return (ans>=m);
        }
    
}