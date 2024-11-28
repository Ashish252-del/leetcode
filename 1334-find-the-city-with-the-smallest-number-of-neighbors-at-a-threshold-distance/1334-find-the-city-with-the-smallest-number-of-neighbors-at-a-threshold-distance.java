class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int mat [][] = new int [n][n];
        for(int i =0; i<n; i++) Arrays.fill(mat[i],Integer.MAX_VALUE);
         for(int i =0; i<n; i++) mat[i][i] = 0;
        for(int i =0; i<edges.length; i++) 
         {mat[edges[i][0]][edges[i][1]] =  edges[i][2];
          mat[edges[i][1]][edges[i][0]] =  edges[i][2];
         }
        for(int i =0; i<n; i++) move(mat,i);
        int ans []= new int [n];
       for(int i =0; i<n; i++) {
           for(int j = 0; j<n; j++) {
        if( i != j && mat[i][j] <= distanceThreshold) ans[i]++;
           }
       } 
        int res = -1;
        for(int i =0; i<n; i++) {
            //if(ans[i] >0 ) {
                if(res == -1) res = i;
                else if (ans[res] >= ans[i]) res =i;
            //}
        }
        return res ;
        
    }
    public void move(int [][] mat , int via) {
        for(int i =0; i<mat.length; i++) {
            for(int j =0; j<mat[0].length; j++) {
                if( mat[i][via] != Integer.MAX_VALUE && mat[via][j] != Integer.MAX_VALUE ) {
              if(mat[i][j] == Integer.MAX_VALUE || mat[i][via] + mat[via][j] < mat[i][j])                    mat[i][j] = mat[i][via] + mat[via][j];
                }
            }
        }
    }
}