class Solution {
    public int findCircleNum(int[][] isConnected) {
      int v =   isConnected.length;
        if(v == 1) return 1;
      boolean check [] = new boolean[v];
    
        int ans = 0; // i = 0, 1 ,2
        for(int i =0; i<v; i++) {
            if(!check[i]) {
                ans++;
                check[i] = false;
            markfalse(i,isConnected,check);
            }
        }
        return ans ;
    }
    void markfalse (int j , int[][] isConnected,  boolean check []) {
        Queue<Integer> q = new LinkedList<>();
        q.add(j);
        while(!q.isEmpty())
      {  int r = q.poll();
            for(int i = 0; i<isConnected.length; i++) {
          if(isConnected[r][i] == 1) {
              if(r != i && !check[i]) q.add(i);
              check[i] = true;}
          
       }
      }
    }
}