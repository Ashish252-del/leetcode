class Solution {
    public int findChampion(int n, int[][] edges) {
        int freq [] = new int [n];
       for(int i =0; i<edges.length; i++) {
           freq[edges[i][1]]++;
       }
        int ans = -1;
        for(int i =0; i<n; i++) {
            if(freq[i] == 0 && ans != -1) return -1;
            if(freq[i] == 0) ans = i;
        }
        return ans ;
    }
}