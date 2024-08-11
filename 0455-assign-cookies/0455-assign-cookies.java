class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int p = 0;
        int cnt =0;
        for(int i =0; i<s.length; i++) {
            if(p>=g.length) break;
          if(s[i] < g[p]) {
              continue;
          }
            cnt++;
            p++;
        }
        return cnt;
    }
}