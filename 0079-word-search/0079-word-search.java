class Solution {
    Boolean sc = false ;
    public boolean exist(char[][] board, String word) {
        Boolean res = false;
        int m = board.length;
        int n = board[0].length;
         for(int i =0; i<m; i++) {
           for (int j = 0; j<n; j++) { 
               char temp = board[i][j];
               board[i][j] = '0'; 
             solve(board,word,i,j,m,n,temp+"",res );  
               board[i][j] = temp; 
               if(sc == true) return true;
                       
                   }
               }
        return sc;
    }
    
 public void solve(char[][] board, String word, int i , int j , int m , int n, String str,Boolean ans  ) {
       if(str.length() > word.length() ) return  ;
        if(str.equals(word)) {
            ans = true ;
            sc = true;
            return ;
        }
        if(ans == true ) return;
                {
                   if(isValid(i,j-1,m,n,board)){
                          char temp = board[i][j-1];
                        board[i][j-1] = '0'; 
                       solve(board,word,i,j-1,m,n,str+temp,ans);
                       board[i][j-1] = temp;
                   }
                   if(isValid(i,j+1,m,n,board)) {
                       char temp = board[i][j+1];
                        board[i][j+1] = '0'; 
                       solve(board,word,i,j+1,m,n,str+temp,ans);
                       board[i][j+1] = temp;}
                   if(isValid(i+1,j,m,n,board)) { 
                       char temp = board[i+1][j];
                        board[i+1][j] = '0'; 
                       solve(board,word,i+1,j,m,n,str+temp,ans);
                       board[i+1][j] = temp;}
                   if(isValid(i-1,j,m,n,board)) {
                       char temp = board[i-1][j];
                        board[i-1][j] = '0'; 
                       solve(board,word,i-1,j,m,n,str+temp,ans);
                       board[i-1][j] = temp;}
               }   
    }
    
    
    public boolean isValid(int i , int j, int m , int n,char[][] board ) {
        if(i<0 || i>=m) return false ;
        if(j<0 || j>=n) return false;
        if(board[i][j] =='0') return false;
        return true;
    }
}