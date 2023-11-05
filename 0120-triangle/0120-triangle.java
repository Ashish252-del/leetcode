class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int memo [][]= new int [triangle.size()][triangle.size()+1] ;
        for(int i =0; i<memo.length; i++) 
            Arrays.fill(memo[i], -1);
      return solve(1,0,triangle,triangle.size(),memo);
    }
  public int solve (int r , int i, List<List<Integer>> triangle, int n , int memo [][]) {
      if(memo[i][r] != -1) return memo[i][r];
        if(r>n || i>=r) return Integer.MAX_VALUE;
        if(r ==n) {
            int curr = triangle.get(r-1).get(i);
             if(i+1<r)   curr = Math.min(curr,triangle.get(r-1).get(i+1));
            memo[i][r] = curr;
            return curr ;
        }
        int a =  Integer.MAX_VALUE;
          if(r<n) a = solve(r+1,i,triangle, n, memo) + triangle.get(r-1).get(i);
        int b = Integer.MAX_VALUE;
        if(i+1<r) b = solve(r+1,i+1,triangle, n, memo)+ triangle.get(r-1).get(i+1);
      memo[i][r] = Math.min(a,b);
        return memo[i][r];
    }
   
}