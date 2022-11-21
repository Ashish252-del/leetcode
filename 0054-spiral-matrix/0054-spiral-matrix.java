class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int l =0, r=matrix[0].length-1, u=0,d=matrix.length-1;
       while(u<=d && l<=r){
           for(int i =l; i<=r; i++) ans.add(matrix[u][i]);
           u++;
           for(int i =u; i<=d;i++) ans.add(matrix[i][r]);
           r--;
           if(u<=d) {
               for(int i = r; i>=l; i--)
                   ans.add(matrix[d][i]);
               d--;
           }
        if(l<=r){
            for(int i = d; i>=u; i--)
                ans.add(matrix[i][l]);
            l++;
        }    
       }
        return ans;
    }
}