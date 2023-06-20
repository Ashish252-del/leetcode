//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        if(n==1) return a[0];
        int min = a[0], ans = Integer.MIN_VALUE, max = a[0];
        int curr = a[0], temp = a[0]; int sum =0;
        for(int i =0; i<n; i++) sum+=a[i];
        for(int i =1; i<n; i++ ){
            curr = Math.min(curr+a[i],a[i]);
            min = Math.min(min,curr);
            temp = Math.max(temp+a[i],a[i]);
            max = Math.max(max,temp);
           if(min!=sum) ans = Math.max(sum-min,ans);
        }
       return Math.max(ans,max);
    }
    
}

