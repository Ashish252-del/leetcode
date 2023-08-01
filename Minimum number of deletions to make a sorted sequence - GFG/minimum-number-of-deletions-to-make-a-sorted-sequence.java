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
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java
class Solution
{
	public int minDeletions(int arr[], int n) 
	{ 
	   int c[] = new int [n];
	   int len = 1;
	   c[0] = arr[0];
	   for(int i =1; i<n; i++) {
	      if(c[len-1]<arr[i]) {c[len]=arr[i]; len++;}
	      else {
	          int inx = ceiling(0,len-1, c, arr[i]);
	          c[inx] = arr[i];
	      }
	   }
	   return arr.length-len;
	} 
	public int ceiling (int l , int r, int c[] , int t){
	    while (r>l) {
	        int mid = (l+r)/2;
	        if(c[mid]>=t) r = mid;
	        else l = mid+1 ;
	    }
	    return r;
	}
}