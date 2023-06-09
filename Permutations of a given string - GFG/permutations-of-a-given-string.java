//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends



class Solution {
    public List<String> find_permutation(String S) {
        List<String> ans = new ArrayList<>();
        permute(S, ans, 0);
        Collections.sort(ans, String.CASE_INSENSITIVE_ORDER);
        return ans;
    }

    void permute(String str, List<String> ans, int i) {
        if (i == str.length() - 1) {
          if(!ans.contains(str))  ans.add(str);
            return;
        }
        for (int j = i; j < str.length(); j++) {
            str = swap(i, j, str);
            permute(str, ans, i + 1);
            str = swap(i, j, str);
        }
    }

    String swap(int p, int q, String str) {
        if (p == q) {
            return str;
        }
        if (q == (str.length() - 1)) {
            return str.substring(0, p) + str.charAt(q)
                    + str.substring(p + 1, q) + str.charAt(p);
        }
        return str.substring(0, p) + str.charAt(q) + str.substring(p + 1, q) + str.charAt(p) + str.substring(q + 1);
    }
}
