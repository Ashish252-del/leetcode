class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
      //  if(prerequisites.length==0) return (new int [1]);
        int ans [] = new int [numCourses];
        
        // creating list
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<numCourses; i++) adj.add(new ArrayList<>());
        for(int i =0; i<prerequisites.length; i++)
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        
        // filling inorder
        int inorder [] = new int [numCourses];
        for(int i =0; i<adj.size(); i++){
            for(int j=0; j<adj.get(i).size(); j++)
                inorder[adj.get(i).get(j)]++;
        }
        
        // filling queue with 0 dependency
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<numCourses; i++)
            if(inorder[i]==0) q.add(i);
        
        // removing and adding item in queue
        int k = numCourses-1;
        while(!q.isEmpty()){
            int a = q.poll();
            ans[k] = a; 
            k--;
            for(int i =0; i<adj.get(a).size(); i++){
                int t = adj.get(a).get(i);
                inorder[t]--;
                if(inorder[t]==0) q.add(t);
            }
                
        }
        if(k==-1) return ans;
        else return (new int [0]);
        
    }
}