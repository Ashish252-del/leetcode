//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i =0; i<query.size(); i++) {
            arr.add(hasThree(query.get(i)));
       }
       
      return arr;
    }
    static int hasThree(long a) {
        int cnt = 0;
        long arr [] = new long[(int)a + 1];
        Arrays.fill(arr,0);
           for(long i = 2 ; i<=a; i++) {
              
               for(long j =2*i; j<=a; j=j+i){
                   if( arr[(int)j]>1) continue;
                  arr[(int)j]++;
               }
             
               }
           for(int i = 4; i<=(int)a; i++) if(arr[i]==1) cnt++;
         return cnt;
       }
}