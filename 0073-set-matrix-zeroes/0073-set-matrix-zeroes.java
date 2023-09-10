class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList <Integer> row = new ArrayList<>();
         ArrayList <Integer> col = new ArrayList<>();
        for(int i =0; i<matrix.length; i++) {
            for(int j =0; j<matrix[i].length; j++) {
                if(matrix[i][j] ==0) {row.add(i); col.add(j);}
            }
        }
        for(int i =0; i<row.size(); i++) {
            int r = row.get(i);
            for(int j =0; j<matrix[r].length; j++) matrix[r][j] = 0;
        }
          for(int i =0; i<col.size(); i++) {
            int r = col.get(i);
            for(int j =0; j<matrix.length; j++) matrix[j][r] = 0;
        }
    }
}