class Solution {
    int cnt = 0; // Discovery time counter

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] t = new int[n]; // Discovery time
        int[] l = new int[n]; // Lowest discovery time reachable
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (List<Integer> connection : connections) {
            adj.get(connection.get(0)).add(connection.get(1));
            adj.get(connection.get(1)).add(connection.get(0)); // Undirected graph
        }
        
        // Perform DFS
        dfs(0, -1, t, l, vis, adj, ans); // Start DFS from node 0
        return ans;
    }

    private void dfs(int s, int p, int[] t, int[] l, boolean[] vis, List<List<Integer>> adj,      List<List<Integer>> ans) {
        vis[s] = true;
        t[s] = l[s] = ++cnt; // Set discovery time and low value
        
        for (int ad : adj.get(s)) {
            if (ad == p) continue; // Skip parent node
            if (!vis[ad]) {
                dfs(ad, s, t, l, vis, adj, ans); // Explore unvisited neighbor
                l[s] = Math.min(l[s], l[ad]); // Update low value of current node
                
                // Check if edge (s, ad) is a bridge
                if (l[ad] > t[s]) {
                    ans.add(List.of(s, ad));
                }
            } else {
                // Update low value for back edge
                l[s] = Math.min(l[s], t[ad]);
            }
        }
    }
}
