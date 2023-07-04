//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        ArrayList <Pair> arr = new ArrayList <>();
        for(int i =0; i<Intervals.length; i++) {
            arr.add( new Pair (Intervals[i][0], Intervals[i][1]));
          //  arr.add(new Pair(Intervals[i], Intervals[1]) );
        }
        Collections.sort(arr);
        int n =0;
        int temp = arr.get(0).end;
        int curr = arr.get(0).start;
        ArrayList <Pair> ans = new ArrayList <>();
        for(int i =1; i<arr.size(); i++) {
            if(temp>=arr.get(i).start) {
                temp = Math.max(temp,arr.get(i).end);
            }
            else {ans.add(new Pair (curr,temp));
            curr = arr.get(i).start;
            temp = arr.get(i).end;}
            
        }
        ans.add(new Pair(curr,temp));
        int [][] merged = new int[ans.size()][2];
        for (int i =0; i<ans.size(); i++) {
            merged[i][0] = ans.get(i).start; merged[i][1] = ans.get(i).end;
        }
      return merged;  
    }
}
class Pair implements Comparable <Pair>
{
    int start ; int end ;
    Pair(int start , int end ) {
        this.start = start ; this.end = end ;
    }
    public int compareTo ( Pair b ) {
        return this.start - b.start ;
    }
}