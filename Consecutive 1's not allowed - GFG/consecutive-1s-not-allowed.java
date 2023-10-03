//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long cnt = 0;
    long countStrings(int n) {
        if(n ==1) return 2;
        if(n==2) return 3;
        String curr = "";
         long memo [] = new long [n+1];
        Arrays.fill(memo, -1);
       //return solve(n,memo);
      memo[1] = 2;
      memo[2] = 3;
      for(int i =3; i<=n; i++) {
          memo[i] = (memo[i-1]+memo[i-2])%1000000007;
      }
       // return cnt;
      return memo[n]%1000000007;  
    }
   
}