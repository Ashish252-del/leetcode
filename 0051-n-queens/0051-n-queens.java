class Solution {
    public List<List<String>> solveNQueens(int n) {
        int [][] mat = new int[n][n]; // 0--> empty , 1--> blocked , 2 -->queen is there 
        List<List<String>> ans = new ArrayList<>();
        solve(mat, 0, n,ans);
        return ans ;
    }
    
    public void solve(int [][] mat , int row , int n, List<List<String>> ans) {
        if(row == n ) {
             List<String> curr = new ArrayList<>();
             for(int i =0; i<n; i++) {
                 String str = "";
                 for(int j =0; j<n; j++) {
                    if(mat[i][j] !=0) str+='.';
                     else if(mat[i][j] == 0) str+='Q';  
                 }
                 curr.add(str);
             } 
            ans.add(curr);
            return;
                      }
        for(int i = 0; i<n; i++) {
            if(mat[row][i] == 0) {
             blockPath(row,i,n,mat);
             solve(mat,row+1,n,ans);
             unBlockPath(row,i,n,mat);  
            }
        }
    }
public void blockPath(int r , int c , int n, int [][] mat) {
    // block row 
    for(int i = 0; i<n; i++) {
        if(c!=i) mat[r][i] += 1;
    } // block column
    for(int i = 0; i<n; i++) {
        if(i!=r) mat[i][c] += 1;
    }
    // block diagonal
    int p = r-1, q=c-1;
    while (p>=0 && q>=0) {mat[p][q] +=1; p--; q--;}
      p = r+1; q=c+1;
    while (p<n && q<n) {mat[p][q] +=1; p++; q++;}
     p = r-1; q=c+1;
     while (p>=0 && q<n) {mat[p][q] +=1; p--; q++;}
    p = r+1; q=c-1;
     while (p<n && q>=0) {mat[p][q] +=1; p++; q--;}
}
    public void unBlockPath(int r , int c , int n, int [][] mat) {
    // block row 
    for(int i = 0; i<n; i++) {
        if(c!=i) mat[r][i] -= 1;
    } // block column
    for(int i = 0; i<n; i++) {
        if(i!=r) mat[i][c] -= 1;
    }
    // block diagonal
    int p = r-1, q=c-1;
    while (p>=0 && q>=0) {mat[p][q] -=1; p--; q--;}
      p = r+1; q=c+1;
    while (p<n && q<n) {mat[p][q] -=1; p++; q++;}
      p = r-1; q=c+1;
     while (p>=0 && q<n) {mat[p][q] -=1; p--; q++;}
    p = r+1; q=c-1;
     while (p<n && q>=0) {mat[p][q] -=1; p++; q--;}
    
}
}