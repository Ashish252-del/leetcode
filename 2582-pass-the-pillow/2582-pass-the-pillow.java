class Solution {
    public int passThePillow(int n, int time) {
        if(time+1 <=n) return time+1;
       int ans = 1; boolean r = true; int t = 1;
        while (t <= time) {
            t++;
            if(r){ ans++;
                  if(ans == n) r = false;
            }
            else if (!r) {
                ans--;
                if(ans ==1) r = true;
            }
        }
        return ans ;
    }
}