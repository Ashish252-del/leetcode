//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
      int memo [] [] = new int [W+1][n+1]; // [wt][n]
      for(int i =0; i<W+1; i++) memo[i][0] = 0;
      for(int i =0; i<n+1; i++) memo[0][i] = 0;
      for(int i =1 ;i<W+1; i++) {
          for(int j =1; j<n+1; j++) {
              if(wt[j-1]>i) memo[i][j] = memo[i][j-1];
              else memo[i][j] = Math.max(memo[i][j-1] , (memo[i-wt[j-1]][j-1] + val[j-1]));
          }
      }
        // if(wt[n-1] >W) { knapSack(W, wt, val , n-1);}
        // return Math.max(knapSack(W,wt,val,n-1) , knapSack(W-wt[n-1], wt,val, n-1) + val[n-1]);
        return memo[W][n];
    } 
}


