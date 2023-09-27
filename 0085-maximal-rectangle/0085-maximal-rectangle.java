class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans = Integer.MIN_VALUE;
        int arr [] = new int [matrix[0].length];
        for(int i =0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++) {
                if(matrix[i][j] == '0') arr[j] = 0;
                else arr[j] = arr[j]+1 ; 
            }
           ans = Math.max(ans, hist(arr)); 
        }
        int a [] = {3,3,1,3};
        return ans;
    }
    
    public int hist(int arr[]) {
        Stack<Integer> h = new Stack<>();
        int n = arr.length;
        int ans = Integer.MIN_VALUE;  int curr = Integer.MIN_VALUE;
        for(int i =0; i<n; i++) {
        while(!h.isEmpty() && arr[h.peek()] > arr[i] ) {
            int t = h.pop();
            if(h.isEmpty()) curr = (i)*arr[t];
            else curr = arr[t]*((i-1)-h.peek());
            ans = Math.max(ans, curr);
        }   
            h.push(i);
        }
        while(!h.isEmpty()){
           int t = h.pop();
            if(h.isEmpty()) curr = n*arr[t];
            else curr = arr[t]*((t-h.peek())+((n-1)-t));
            ans = Math.max(ans, curr);
        }
        return ans ;
    }
}