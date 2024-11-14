class Solution {
    public int orangesRotting(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        int cnt = 0;
        boolean has = false;
         Queue<int[]> pq = new LinkedList<>();
        // Ensure the inner loop goes over all columns (not starting from `i`)
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0) has = true;
                // If we find an unvisited rotten orange
                if (!visited[i][j] && grid[i][j] == 2) {
                     pq.add(new int[]{i, j});
                
                }
              
            }
        }
if (pq.size() == 0) {
    return (has) ? -1 : 0;
}
  ans += markRotten(grid, visited,pq);
 for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] ==1) {
                    return -1;

                }
              
            }
        }
        return ans;
    }
    
    int markRotten(int[][] grid, boolean[][] visited, Queue<int[]> pq) {
        int min = 0;
        while (!pq.isEmpty()) {
            boolean isF = false;
            int s = pq.size();
            
            // Process all cells at the current "depth" level
            for (int k = 0; k < s; k++) {
                int[] temp = pq.poll();
                int p = temp[0], q = temp[1];
                
                if (grid[p][q] == 1) isF = true; // Found a fresh orange
                
                // Check all 8 possible directions
                int[][] directions = {
                    {-1, 0}, {1, 0}, {0, -1}, {0, 1}
                };
                
                for (int[] dir : directions) {
                    int newP = p + dir[0];
                    int newQ = q + dir[1];
                    
                    if (newP >= 0 && newP < grid.length && newQ >= 0 && newQ < grid[0].length &&
                        !visited[newP][newQ] && grid[newP][newQ] != 0) {
                        
                        pq.add(new int[]{newP, newQ});
                        visited[newP][newQ] = true; // Mark as visited immediately
                    }
                }
            }
            
            // If at least one fresh orange was found at this level, increment `min`
            if (isF) min++;
        }
        
        return min;
    }
}
