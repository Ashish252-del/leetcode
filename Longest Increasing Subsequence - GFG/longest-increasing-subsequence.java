//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        int tail [] = new int [size];
        tail[0] = a[0];
        int len = 1;
        for(int i =1; i<size; i++) {
            if(a[i]>tail[len-1]) {tail[len] = a[i]; len++;}
            else {
                int inx = celInx(0,len-1,tail, a[i]);
                tail[inx] = a[i];
            }
        }
        return len ;
    }
    
    static int celInx (int l , int r , int arr[], int tar) {
        while(r>l) {
            int mid = (l+r)/2;
            if(arr[mid]>=tar) r = mid ; 
            else l = mid +1;
        }
        return r;
    }
} 