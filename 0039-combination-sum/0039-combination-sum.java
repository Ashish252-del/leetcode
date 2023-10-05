class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        List<Integer> arr = new ArrayList<>();
        solve(arr,ans,candidates,n,target);
        return ans ;
        
    }
    void solve ( List<Integer> arr,List<List<Integer>> ans,int [] c , int n , int t) {
        if( t ==0) {
            //Collections.sort(arr);
           // if(t==0)
            ans.add(new ArrayList<>(arr));
          //    arr.remove(arr.size()-1);
            return ;
        }
        if( t<0 || n<=0) {
         //if(arr.size()>0)arr.remove(arr.size()-1);
            return ;
        }
        
       if(t>=c[n-1]) { 
           arr.add(c[n-1]);
           solve(arr,ans,c,n,t-c[n-1]); 
            arr.remove(arr.size()-1);}
      solve(arr, ans ,c , n-1, t );
        
    }
}