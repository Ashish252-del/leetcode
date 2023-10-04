class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int o = n;
        int c = n;
        String curr = "";
        solve(curr, o , c, ans);
     return ans ;
        
    }
    void solve (String curr , int o , int c, List<String> ans) {
         if(o ==0 && c ==0){ 
            ans.add(curr);
            return ; }
       // if(o ==0 || c ==0) return ;
        String op = curr + '(';
      if(o>0)  solve(op, o-1, c,ans);
         String op2 = curr + ')';
        if(c>o) solve(op2, o, c-1, ans);
        return;
    }
}