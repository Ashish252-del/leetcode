class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        boolean[][] vis = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                    q.offer(new int[] { i, j });
                    vis[i][j] = true;
                } else {
                    ans[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            if (r + 1 < m && !vis[r + 1][c]) {
                ans[r + 1][c] = ans[r][c] + 1;
                q.offer(new int[] { r + 1, c });
                vis[r + 1][c] = true;
            }

            if (r - 1 >= 0 && !vis[r - 1][c]) {
                ans[r - 1][c] = ans[r][c] + 1;
                q.offer(new int[] { r - 1, c });
                vis[r - 1][c] = true;
            }

            if (c + 1 < n && !vis[r][c + 1]) {
                ans[r][c + 1] = ans[r][c] + 1;
                q.offer(new int[] { r, c + 1 });
                vis[r][c + 1] = true;
            }

            if (c - 1 >= 0 && !vis[r][c - 1]) {
                ans[r][c - 1] = ans[r][c] + 1;
                q.offer(new int[] { r, c - 1 });
                vis[r][c - 1] = true;
            }
        }
        
        return ans;
    }
}