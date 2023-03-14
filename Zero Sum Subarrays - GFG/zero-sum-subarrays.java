//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        long pre [] = new long [n];
        pre[0] = arr[0];
        for(int i =1; i<arr.length; i++){
            pre[i] = (arr[i]+pre[i-1]);
        }
        long ans = 0;
        HashMap<Long,Long> s = new HashMap<>();
        for(int i =0; i<pre.length; i++) {
            if( s.containsKey(pre[i])) s.put(pre[i], s.get(pre[i])+1);
            else s.put(pre[i],(long)1);
        }
        for(Map.Entry<Long,Long> e: s.entrySet()) {
            long t = e.getValue();
          if(e.getKey()==0) ans+= (t*(t+1))/2;
            else if(t>1) ans += (t*(t-1))/2;
        }
        return ans;
    }
}