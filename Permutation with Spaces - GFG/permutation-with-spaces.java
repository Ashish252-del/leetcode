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
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    ArrayList<String> ans = new ArrayList<>();
    ArrayList<String> permutation(String S){
        int k = S.length();
       fillSpaces(ans,S, 1, k, 1);
       return ans;
    }
    
   void  fillSpaces(ArrayList<String> arr , String str , int cnt, int k , int i  ) {
       if(cnt >= k) {
           arr.add(str);
           return ;
       }
         String temp  = str.substring(0,i)+" "+str.substring(i);
       fillSpaces(arr,temp,cnt+1, k, i+2);
     
       fillSpaces(arr,str,cnt+1, k, i+1);
   }
    
}