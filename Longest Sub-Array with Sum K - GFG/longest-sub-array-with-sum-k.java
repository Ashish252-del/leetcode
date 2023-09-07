//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
       HashMap<Integer, Integer> h = new HashMap<>();
       int pref [] = new int [N];
       int curr = A[0];
       pref[0] = curr;
       for(int i =1; i<N; i++) {
          curr += A[i];
          pref[i] = curr;
       }
       int res = 0;
       for(int i =0; i<N; i++) {
           if(h.containsKey(pref[i]-K)) {
               int temp = h.get(pref[i]-K);
              // if(pref[i]-K == 0) res = Math.max(res, i +1);
               res = Math.max(res, i -h.get(pref[i]-K));
           }
         if (pref[i] == K) res = Math.max(res, i+1);
          if(!h.containsKey(pref[i])) h.put(pref[i], i);
       }
       return res ;
    }
  
}


