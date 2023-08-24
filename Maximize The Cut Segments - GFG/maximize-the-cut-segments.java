//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
      int arr [] = new int [n+1];
      arr[0] = -1;
      int min = Math.min(Math.min(x,y),z);
      for(int i = 1; i<arr.length; i++) {
           int max =-1;
          if(i==x || i==y || i==z) max = 0;
              if(i-x>=0) {max = Math.max(max, arr[i-x]);}
               if(i-y>=0) {max = Math.max(max, arr[i-y]);}
               if(i-z>=0){ max = Math.max(max, arr[i-z]);}
             if(max>=0) arr[i] = max+1;
             else  arr[i] = -1;
      }
      if(arr[n] == -1) return 0;
      return arr[n];
    }
}



//User function Template for Java


// class Solution
// {
//     //Function to find the maximum number of cuts.
//     public int maximizeCuts(int n, int x, int y, int z)
//     {
//         int arr[] = new int[n+1];
//         Arrays.fill(arr, -1);
//       return maxCut(arr,n,x,y,z);
       
//     }
//     public int maxCut(int arr[], int n, int x, int y, int z) {
//         if(n<0) return -1;
//         if(arr[n] != -1) return arr[n];
//         if(n==0) { arr[n] = 0; return 0;}
//         arr[n] = Math.max(Math.max(maxCut(arr,n-x,x,y,z), maxCut(arr,n-y,x,y,z)), maxCut(arr,n-z,x,y,z));
//         if(arr[n] == -1) return -1;
//         else {arr[n]++; return arr[n];}
//       //  return arr[n];
//     }
// }