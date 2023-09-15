class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        if(h == n) return piles[n-1];
        int r = piles[n-1];
        int l = 1;
       int ans = Integer.MAX_VALUE;
        while(r>=l) {
            int mid = (l+r)/2;
            long t = eatingTime(piles, mid);
            if(t<=h){ ans = Math.min(mid,ans);
                 r=mid-1; }
           else if (t>h) {  l=mid+1; }
        }
       return ans; 
    }
    
    public long eatingTime(int arr[], int k ){
        long ans = 0;
        for(int i =0; i<arr.length; i++){ ans+= (arr[i]/k);
            if((arr[i] % k )!=0) ans++;        }
        return ans;
    }
}