class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int arr [] = new int [cuts.length +2];
        arr[0] = 0;
        arr[cuts.length+1] = n;
        for(int i =1; i<=cuts.length; i++) {
            arr[i] = cuts[i-1];
        }
        int memo [][]= new int [cuts.length+2][cuts.length+2];
        for(int i =0; i<memo.length; i++) Arrays.fill(memo[i],-1);
        return solve(1,arr.length-2,arr,memo);
    }
    
    public int solve (int i , int j , int []cuts, int memo [][] ) {
        if(i>j) return 0;
        if(memo[i][j] != -1) return memo[i][j];
       
        int res = Integer.MAX_VALUE;
        for(int k = i; k<=j; k++)
       { res = Math.min(res , 
                        solve(i,k-1,cuts,memo) + solve(k+1,j,cuts,memo)+ (cuts[j+1]-cuts[i-1]));}
        memo[i][j] = res ;
        return res ;
    }
}