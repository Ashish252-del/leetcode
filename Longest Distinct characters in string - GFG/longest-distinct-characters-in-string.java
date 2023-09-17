//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
       HashSet<Character> h = new HashSet<>();
      int ans = 0; int j =0;
       for(int i =0; i<S.length(); i++) {
           if(h.contains(S.charAt(i))) {
               ans = Math.max(ans,h.size());
              while(h.contains(S.charAt(i))) {
                  h.remove(S.charAt(j)); j++;
              }
           }
           h.add(S.charAt(i));
       }
       ans = Math.max(ans, h.size());
        return ans;
        
    }
}