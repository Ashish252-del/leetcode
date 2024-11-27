class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        int ans [] = new int [queries.length];
         ArrayList<ArrayList<Integer>> arr =  new ArrayList<>();
         for(int i =0; i<n; i++) {
            arr.add(new ArrayList<Integer>());
           if(i+1<n) arr.get(i).add(i+1);
        }
        for(int i =0; i<queries.length; i++) {
            arr.get(queries[i][0]).add(queries[i][1]);
            ans [i] = bfs(n,arr);
        }
        return ans ;
    }
    
    public int bfs (int n , ArrayList<ArrayList<Integer>> arr) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean [] visited = new boolean [n];
        int d [] = new int [n];
        visited[0] = true;
        d[0] = 0;
        while (!q.isEmpty()) {
            int p = q.poll();
            if(p == n-1) return d[n-1] ;
          for (int i =0; i<arr.get(p).size(); i++) {
              int t = arr.get(p).get(i);
              if(!visited[t]) {
                 visited[t] = true;
                  q.add(t);
                  d[t] = d[p] + 1;
              }
          }
        }
        return d[n-1];
    }
}