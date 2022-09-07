class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
      if(source==destination) return true;
        boolean [] visited = new boolean[edges.length];
        Queue <Integer> q = new LinkedList<>();
        for(int i =0; i<edges.length; i++){
            int a = edges[i][0], b=edges[i][1];
            if(source==a){
                if(b==destination) return true;
                else q.add(b); 
                visited[i] = true;
            }
            else if(source==b){
                if(a==destination) return true;
                else q.add(a); 
                 visited[i] = true;
            }
        }
        while(!q.isEmpty()){
            int x = q.poll();
             for(int i =0; i<edges.length; i++){
            int a = edges[i][0], b=edges[i][1];
            if(x==a&&visited[i]==false){
                if(b==destination) return true;
                else q.add(b); 
                visited[i] = true;
            }
            else if(x==b&&visited[i]==false){
                if(a==destination) return true;
                else q.add(a); 
                  visited[i] = true;
            }
        }
             
        }
            
    
        return false;
}
}