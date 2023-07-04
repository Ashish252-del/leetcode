//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
       ArrayList<Pair> arr = new ArrayList<>();
       for(int i =0; i<n; i++) arr.add(new Pair (start[i], end[i]));
       Collections.sort(arr);
       int ans = 1;
       int curr = arr.get(0).end;
       for(int i =1; i<arr.size(); i++) {
           if(arr.get(i).start>curr) {
               ans++; curr = arr.get(i).end;
           }
       }
       return ans ;
    }
}
 class Pair implements Comparable <Pair> {
    int start ; int end ; 
    Pair (int start , int end ) {
        this.start = start ; this.end = end ;
    }
    public int compareTo(Pair that ) {
        return this.end - that.end ;
    }
}
