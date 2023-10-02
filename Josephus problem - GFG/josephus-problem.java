//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//testcases
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int n,k;
		    //taking input n and k
		    n=sc.nextInt();
		    k=sc.nextInt();
		    
		    //calling josephus() function
		    System.out.println(obj.josephus(n,k));
		    
		    
		}
		
	}
}


// } Driver Code Ends


class Solution
{
   public int josephus(int n, int k)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1; i<=n; i++) arr.add(i);
        return solve (arr, k , 0);
    }
   int solve(ArrayList<Integer>arr, int k , int i){
       if(arr.size()==1) return arr.get(0);
       i = (i+k-1)%arr.size();
       arr.remove(i);
      return solve(arr,k,i);
   }
}

