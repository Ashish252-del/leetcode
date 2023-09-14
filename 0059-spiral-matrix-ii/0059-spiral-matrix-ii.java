class Solution {
    public int[][] generateMatrix(int n) {
       int matrix [] [] = new int [n][n]; int v = 1;
        int l =0, r=matrix[0].length-1, u=0,d=matrix.length-1;
       while(u<=d && l<=r){
           for(int i =l; i<=r; i++) matrix[u][i] = v++;
           u++;
           for(int i =u; i<=d;i++) matrix[i][r] = v++;
           r--;
           if(u<=d) {
               for(int i = r; i>=l; i--)
                   matrix[d][i] = v++;
               d--;
           }
        if(l<=r){
            for(int i = d; i>=u; i--)
               matrix[i][l] = v++;
            l++;
        }    
       }
        return matrix;
    }
}