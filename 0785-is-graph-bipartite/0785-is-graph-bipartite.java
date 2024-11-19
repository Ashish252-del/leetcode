class Solution {
    public boolean isBipartite(int[][] graph) {
        int [] arr = new int [graph.length];
        Arrays.fill(arr,-1);
        boolean a = true;
        for(int i =0; i<arr.length; i++) {
            if(arr[i] == -1) {
              a = a && dfs(graph, arr , i, 0);
            }
        }
        return a;
    }
    public boolean dfs(int[][] graph, int arr [], int s, int c) {
        
        arr[s] = c;
        for (int i =0; i<graph[s].length; i++) {
            int newC = (c==1)?0:1;
            if(arr[graph[s][i]] == -1 &&!dfs(graph, arr , graph[s][i], newC)) return false;
            else if (arr[graph[s][i]] == c) return false;
        }
        return true;
    }
}