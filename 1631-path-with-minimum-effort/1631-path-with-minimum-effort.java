class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair (0,0,0));
        int n = heights.length, m = heights[0].length;
        int d[][] = new int [n][m];
        for(int i = 0; i<n; i++) Arrays.fill(d[i],Integer.MAX_VALUE);
        int dir [][] = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            if(p.i == n-1 && p.j == m-1) return p.eff;
            for(int []nd: dir ) {
              int r = nd[0]+p.i, c = nd[1]+p.j;
              if(r>=0 && r<n && c>=0 && c<m ) {
              int eff = Math.max(Math.abs(heights[r][c]-heights[p.i][p.j]), p.eff);
              if(eff<d[r][c])
                { d[r][c] = eff;
                  pq.add( new Pair (eff,r,c));}
              }  
            }
        }
        return -1;
    }
}

class Pair implements Comparable<Pair> {
    int i ;
    int j ;
    int eff ;
    public Pair (int eff , int i , int j ) {
        this.eff = eff;
        this.i = i;
        this.j = j;
    }
    public int compareTo (Pair p ) {
        return this.eff - p.eff;
    }
}