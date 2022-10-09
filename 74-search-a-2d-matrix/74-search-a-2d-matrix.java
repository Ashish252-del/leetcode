class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if((target<matrix[0][0])||target>(matrix[matrix.length-1][matrix[0].length-1])) return false;
        int n = matrix.length, m = matrix[0].length; int curr =0;
        for(int i =0; i<n; i++) 
            if(matrix[i][m-1]>=target) {curr= i; break;}
        return search(curr,target,matrix);
    }
    boolean search(int curr, int target, int[][] matrix){
        int l =0, h = (matrix[0].length)-1;
      
        while(l<=h){
         int mid = (l+h)/2;
        if(matrix[curr][mid]==target) return true;
        if(target>matrix[curr][mid]) l=mid+1;
            else h=mid-1;
            }
        return false;
    }
}