class Solution {
    public int minimumObstacles(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        int [][] dir = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        int ans [][] = new int [m][n];
        for(int i =0; i<m; i++) Arrays.fill(ans[i],Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        ans[0][0] = grid[0][0];
        pq.add(new Pair (0,0,grid[0][0]));
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (p.i == m-1 && p.j == n-1) return p.step;
         for(int [] d :dir) {
            int ni = p.i+d[0]; int nj = p.j+d[1];
             if(ni >=0 && ni<m && nj>=0 && nj < n) {
                 if(ans[ni][nj] > p.step + grid[ni][nj]) {
                   ans[ni][nj] =   p.step + grid[ni][nj];
                     pq.add(new Pair (ni,nj,ans[ni][nj] ));
                 }
             }
         } 
        }
        return -1;
    }
}

class Pair implements Comparable <Pair> {
    int i ;
    int j ;
    int step ;
    public Pair (int i , int j , int step ){
        this.i = i ;
        this.j = j;
        this.step = step;
    }
    public int compareTo (Pair p) {return this.step - p.step;}
}
