class Solution {
    public int hammingDistance(int x, int y) {
        int ans = x^y;
        int cnt = 0;
       while(ans!=0){
           if((ans&1)==1) cnt++;
           ans = ans>>1;
       } 
        return cnt;
    }
}