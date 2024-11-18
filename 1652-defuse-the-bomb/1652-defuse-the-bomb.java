class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans [] = new int [code.length];
        Arrays.fill(ans,0);
        if(k==0) return ans ;
     boolean neg = k<0;
      if(neg) reverseArray(code);
      if(k<0) k = 0-k;
        int cntr = 0;
     for(int i =1; i<=k; i++) cntr += code[i];
        ans[0] = cntr;
    for(int i =1; i<code.length; i++) {
        cntr -= code[i];
        cntr += code[(k+i)%n];
        ans[i] = cntr;
    }
        if(neg) reverseArray(ans);
        return ans ;
    }
    public void reverseArray (int [] arr) {
        int l =0, r= arr.length-1;
        while(r>l) {
           int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}