class Solution {
    public int candy(int[] ratings) {
        int cand [] = new int [ratings.length];
        int n = ratings.length;
        if(n==1) return 1;
         cand[0] = 1;
        for(int i = 1; i<ratings.length; i++) {
            if(ratings[i]>ratings[i-1]) cand[i] = cand[i-1]+1;
            else cand[i] = 1;
        }
        int r = cand[n-1];
        for(int i = n-2; i>=0 ; i--) {
            if(ratings[i]>ratings[i+1]) {
                cand[i] = Math.max(cand[i],r+1);
            }
           r = cand[i];

        }
              
        int ans = 0;
        for(int i =0; i<cand.length; i++) ans+=cand[i];
        return ans ;
    }
}