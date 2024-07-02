class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        if(s.length() == 0) return ans ;
        solve(s,0,temp,ans );
        return ans;
    }
    
    public void solve (String s , int j ,List<String> temp, List<List<String>> ans) {
        if(j == s.length()) {
            ans.add(new ArrayList<>(temp));
           // temp.remove(temp.size()-1);
            return;
        }
        for(int i =j; i<s.length(); i++) {
            if(isPalindrom(j , i , s)) {
                temp.add(s.substring(j, i+1));
               solve(s, i+1, temp , ans); 
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public boolean isPalindrom (int l , int r, String str) {
        while (r>=l)
        {
            if(str.charAt(l) != str.charAt(r)) return false ;
            r--; 
            l++;
        }
        return true ;
    }
}