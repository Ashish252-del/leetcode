class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int cnt =0;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<matrix.length; i++) {
            for(int j =0; j<matrix.length; j++) {
                ans+=Math.abs(matrix[i][j]);
                min = Math.min(min,Math.abs(matrix[i][j]));
                if(matrix[i][j]<0) cnt++;
            }
        }
        if(cnt == 0 || cnt%2 == 0) return ans;
        return ans - 2*min;
    }
}