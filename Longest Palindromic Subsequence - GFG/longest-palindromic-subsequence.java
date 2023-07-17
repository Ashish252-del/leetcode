//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
       StringBuilder d = new StringBuilder();
          d.append(S);
          d.reverse();
        int n = S.length();
        int memo [][] = new int [n+1][n+1];
        for(int i =0; i<=n; i++) {memo[i][0] = 0; memo[0][i]=0;}
        for(int i =1; i<=n; i++) {
            for(int j =1; j<=n; j++) {
                if(S.charAt(i-1)==d.charAt(j-1)) memo[i][j] = 1+memo[i-1][j-1];
                else memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
            }
        }
        return memo[n][n];
    }
}