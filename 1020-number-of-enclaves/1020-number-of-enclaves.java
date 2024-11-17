class Solution {
    public int numEnclaves(int[][] grid) {
        int board [][] = grid;
        int ans = 0;
     int n = board.length;
        int m = board[0].length;
       boolean visited[][] = new boolean[board.length][board[0].length];
        for(int j = 0; j<m; j++) 
      { 
        if(!visited[0][j] && board[0][j] == 1) {
           dfs(board,visited, 0 , j );
       }
         if(!visited[n-1][j] && board[n-1][j] == 1) {
           dfs(board,visited, n-1 , j );
       }}
        
     for(int i = 0; i<n; i++) 
      { 
        if(!visited[i][0] && board[i][0] == 1) {
           dfs(board,visited, i , 0 );
       }
         if(!visited[i][m-1] && board[i][m-1] == 1) {
           dfs(board,visited, i , m-1 );
       }}
     for(int p =0; p<n; p++) {
         for(int q = 0; q<m; q++) {
          if(!visited[p][q] && board[p][q] == 1) ans++; 
         }
     }  
        return ans ;
    }
    public void dfs (int[][] board , boolean visited[][] , int i , int j ) {
        if(board[i][j] == 0) return ;
        visited[i][j] = true;
        int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int d[]: dir) {
            int p = i+d[0], q = j+d[1];
         if(p>=0 && p<board.length && q>=0 && q<board[0].length && !visited[p][q])
             dfs(board,visited,p,q);
        }
    }
}