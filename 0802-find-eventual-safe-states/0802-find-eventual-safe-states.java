class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<graph.length; i++) {
              boolean v [] = new boolean [graph.length];
              boolean rec [] = new boolean [graph.length];
            if(!dfs(graph,i,rec,v)) {
              ans.add(i);
            }
        } 
        return ans ;
    }
    public boolean dfs(int[][] graph, int s , boolean rec[], boolean vis[]){
        rec[s] = true;
        vis[s] = true;
        for(int i =0; i<graph[s].length; i++) {
            int t = graph[s][i];
            if(!vis[t] && dfs(graph,t,rec,vis)) return true;
            else if (vis[t] && rec[t]) return true;
        }
        rec[s] = false;
        return false;

    }
}