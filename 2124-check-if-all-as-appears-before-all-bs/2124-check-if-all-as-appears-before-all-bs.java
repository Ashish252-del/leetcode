class Solution {
    public boolean checkString(String s) {
        int cnt = 0;
        for(int i =1; i<s.length(); i++) {
            if(s.charAt(i) < s.charAt(i-1)) return false;
          //  if(cnt>1) return false ;
        }
        return true;
    }
}