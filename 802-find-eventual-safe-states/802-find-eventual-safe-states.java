class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        int[] indegree = new int[V];
        
        for(int i=0; i<V; i++)
            adj.add(new ArrayList<>());
        
        // Reverse the directed edges of the graph
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                adj.get(graph[i][j]).add(i);
                indegree[i]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V; i++){
            if(indegree[i] == 0)
                q.add(i);
        }
        
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            for(Integer it: adj.get(curr)){
                if(--indegree[it] == 0)
                    q.add(it);
            }
        }
        
        Collections.sort(ans);
        return ans;
    }
}