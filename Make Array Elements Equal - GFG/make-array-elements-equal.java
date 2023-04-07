//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minOperations(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long minOperations(int N) {
        long l = 1 + (N-1)*2;
        long m = (l+1)/2;
        long a = 1;
       long ans =0;
       long k = N/2;
       if(m%2!=0) {
           ans = k*(k+1);
       }
       else {
           k--;
          ans =(( k*(k+1))+k)+1;
       }
        return ans ;
    }
}