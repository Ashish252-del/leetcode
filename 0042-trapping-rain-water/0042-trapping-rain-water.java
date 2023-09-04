class Solution {
    public int trap(int[] height) {
        if(height.length ==1) return 0;
        int mm = Math.min(height[0], height[height.length-1]);
        int ans = 0;
        int lmax []= new int [height.length],  rmax []= new int[height.length]; 
        int n = height.length;
        lmax[0] = height[0];
        rmax[n-1] = height[n-1];
        for(int i =1; i<n; i++) {
            lmax[i] = Math.max(height[i], lmax[i-1]);
        }
        for(int i =n-2; i>=0; i--) {
            rmax[i] = Math.max(height[i], rmax[i+1]);
        }
        for(int i =1; i<height.length-1 ; i++) {
          ans+=(Math.min(lmax[i], rmax[i])-height[i]);
        }
        return ans ;
    }
}