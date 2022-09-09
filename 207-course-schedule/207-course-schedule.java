class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      if(prerequisites.length==0) return true;
        List<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<numCourses; i++) adj.add(new ArrayList<>());
        for(int i =0; i<prerequisites.length; i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        boolean visited [] = new boolean [numCourses], rec [] = new boolean [numCourses];
        for(int i =0; i<numCourses; i++){
            if(!visited[i]) 
                if(dfs(adj,visited,rec,i)) return false;}
            return true;
        
    }
    boolean dfs(List<ArrayList<Integer>>adj, boolean visited[],boolean rec[], int s){
        visited[s] = true;
        rec[s] = true;
        for(int i = 0; i<adj.get(s).size(); i++){
            int u = adj.get(s).get(i);
            if(visited[u]==false && dfs(adj,visited,rec,u)) 
                return true;
            else if (rec[u]) return true;
        }
        rec[s] = false;
        return false;
    }
}