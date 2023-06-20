class Solution {
    public int maxTurbulenceSize(int[] arr) {
        boolean check = true;
        if(arr.length<2) return arr.length;
        int cnt = 2, ans = 2, j =2,prev=0;
        for(int i =1; i<arr.length; i++) {
            if(arr[i]!=arr[i-1]) {prev= arr[i]-arr[i-1]; j = i+1; break;}
        }
        if(prev==0) return 1;
        for(int i =j; i<arr.length; i++) {
            if(prev==-1) prev=arr[i-1] - arr[i-2];
            int curr = arr[i] - arr[i-1];
            if(prev<0) {
                if(curr>0) {cnt++; prev = curr;}
                else {ans = Math.max(cnt,ans); cnt = 2; prev = curr;}
            }
            else if(prev>0) {
                if(curr<0) {cnt++; prev = curr;}
                else {ans = Math.max(cnt,ans); cnt = 2; prev = curr;} 
            }
            if(curr == 0|| prev ==0) {ans = Math.max(cnt,ans); i++; cnt =2 ; prev =-1;}
        }
        return Math.max(ans,cnt);
    }
}