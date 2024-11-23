class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
       int dir [][] = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
       Queue<Pair> q = new LinkedList<>();
       if(grid[0][0] == 0) q.add(new Pair (0,0,1));
        int dist [][] = new int [grid.length][grid.length];
        dist[0][0] = 1;
        for(int i =0; i<grid.length; i++) Arrays.fill(dist[i],Integer.MAX_VALUE);
        while(!q.isEmpty()) {
            Pair p = q.poll();
            if(p.r == grid.length -1 && p.c == grid.length -1) return p.d;
            for(int [] d: dir) {
                int i = p.r+d[0];
                int j = p.c+d[1];
            if(i>=0 && i<grid.length && j>=0 && j<grid.length && grid[i][j] == 0 &&    dist[i][j] > p.d+1) {
               if(i == grid.length -1 && j == grid.length -1) return p.d+1;
                dist[i][j] = p.d+1;
                q.add(new Pair(i,j,p.d+1));
            }

            }
        }
        return -1;
    }
}

class Pair {
    int r ;
    int c;
    int d ;
    public Pair(int r , int c, int d) {
        this.r = r;
        this.d = d;
        this.c = c;
    }
}