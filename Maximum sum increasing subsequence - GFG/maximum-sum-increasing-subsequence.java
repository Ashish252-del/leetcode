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
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int lcs [] = new int [n];
	    lcs[0] = arr[0];
	    for(int i =1; i<n; i++) {
	        lcs[i] = arr[i];
	        for(int j =0; j<i; j++) {
	          if(arr[j]<arr[i]) lcs[i] = Math.max(arr[i]+lcs[j], lcs[i]);  
	        }
	    }
	    int ans = lcs[0];
	    for(int i =1; i<lcs.length; i++) {
	        ans = Math.max(lcs[i],ans);
	    }
	    return ans ;
	}  
}