class Solution {
    public int equalPairs(int[][] grid) {
       // int trans [] [] = new int [grid.length][grid.length];
        HashMap<ArrayList<Integer>,Integer> s = new HashMap<>();
        int ans = 0;
        for(int i =0 ; i<grid.length; i++) {
           ArrayList<Integer> a = new ArrayList<>();
            for(int j =0; j<grid[i].length; j++) {
               a.add(grid[j][i]); 
            }
            if(!s.containsKey(a)) {s.put(a,1); }
            else{ s.put(a,s.get(a)+1); };
           
        }
          for(int i =0 ; i<grid.length; i++) {
           ArrayList<Integer> b = new ArrayList<>();
            for(int j =0; j<grid.length; j++) {
               b.add(grid[i][j]); 
            }
            if(s.containsKey(b)) ans+=s.get(b);
           
        }
      return ans;
     
    }
}