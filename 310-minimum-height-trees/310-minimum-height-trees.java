class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
       
        List<ArrayList<Integer>> adj = new ArrayList<>();
      
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<n; i++) adj.add(new ArrayList<>());
        for(int i =0; i<edges.length; i++){ adj.get(edges[i][0]).add(edges[i][1]);
                                          adj.get(edges[i][1]).add(edges[i][0]);}
        int inorder[] = new int[n];
        
        for(int i =0; i<n; i++) {
          for(int j= 0; j<adj.get(i).size(); j++){
              int x = adj.get(i).get(j);
              inorder[x]++;
          }
              
        }
   Queue <Integer> q = new LinkedList<>();
        for(int i =0; i<n; i++){
            if(inorder[i]==1) q.add(i);
        }
        
  while(!q.isEmpty()){
      ans.clear();
     
      int p = q.size();
      for(int j = 0; j<p; j++){
           int a = q.poll();
          ans.add(a);
      for(int i=0; i<adj.get(a).size(); i++){
          int b = adj.get(a).get(i); 
          inorder[b]--;
          
          if(inorder[b]==1) {q.add(b); }
      }
      }
  }
      if(n==1) {ans.add(0); return ans;}
        return ans;
    }


}