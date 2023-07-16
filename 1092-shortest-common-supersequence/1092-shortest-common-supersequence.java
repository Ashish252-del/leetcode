class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
         int m = str1.length(), n = str2.length();
        int memo [] [] = new int [m+1][n+1];
        for(int i =0; i<=m; i++) memo[i][0] = 0;
        for(int i =0; i<=n; i++) memo[0][i] = 0;
   for(int i =1 ;i<=m; i++) {
       for(int j =1; j<=n; j++) {
           if(str1.charAt(i-1)==str2.charAt(j-1)) memo[i][j] = 1+memo[i-1][j-1];
           else memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
       }
   }
      //  String temp = memo[m][n];
    int i =m, j = n;
        String ans = "";
        while(i>0 && j>0) {
            if(str1.charAt(i-1)==str2.charAt(j-1)) {
                ans = str1.charAt(i-1) + ans ; i--; j--;}
            else if (memo[i-1][j]>memo[i][j-1]) {
                ans = str1.charAt(i-1)+ans; i--; 
            }
            else {
                  ans = str2.charAt(j-1)+ans;  j--; 
            }
        }
        while(i>0) {
           ans = str1.charAt(i-1) + ans;  i--;
        }
          while(j>0) {
           ans = str2.charAt(j-1) +ans; j--;
        }
        return ans;
    }
}