class Solution {
    public int countSubstrings(String s) {
      return  count(s, s.length(), "");
    }
    
    public int count (String s , int n , String str ) {
      int cnt = 0;
        for(int i =0; i<n; i++) {
            String temp = s.charAt(i) +"";
            if(isPalindrom(temp)) cnt++;
            for(int j = i+1; j<n; j++) {
                temp += s.charAt(j);
                if(isPalindrom(temp)) cnt++;
            }
        }
        return cnt;
    }
    boolean isPalindrom( String str ) {
        if(str.length() ==0) return false;
        int i =0,j = str.length()-1;
        while(j>i) {
            if(str.charAt(i) != str.charAt(j)) return false ;
            i++;
            j--;
        }
        return true;
    }
}