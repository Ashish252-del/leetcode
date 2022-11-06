//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int graph[][] = new int[N][N];
            
            for(int i = 0;i < N;i++)
                {String a[] = in.readLine().trim().split("\\s+");
                for(int j=0;j<N;j++)
                graph[i][j] = Integer.parseInt(a[j]);}
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.transitiveClosure(N, graph);
            for(int i = 0;i < N;i++)
               { for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
            System.out.println();}
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       for(int i =0; i<N; i++) ans.add(new ArrayList<Integer>());
       boolean visited [] = new boolean[N];
       Arrays.fill(visited,false);
     
       for(int i =0; i<N; i++){
           bfs(i,N,graph,visited);
           for(int j =0; j<N; j++){
               if(visited[j]) ans.get(i).add(1);
               else ans.get(i).add(0);
           }
           Arrays.fill(visited,false);
       }
       return ans;
    }
   static void bfs (int s , int N, int graph[][], boolean visited[]){
        visited[s] = true;
          Queue<Integer> q = new LinkedList<>();
          q.add(s);
         while(!q.isEmpty()){
             int u = q.poll();
             for(int i=0; i<N; i++){
                int x = graph[u][i];
                if((!visited[i])&&(x==1)){
                    visited[i] = true;
                    q.add(i);
                }
             }
         } 
    }
}