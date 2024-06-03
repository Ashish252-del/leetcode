class Solution {
    public int appendCharacters(String s, String t) {
        String str = s+t;
        int n = s.length();
        int i = 0; 
        int ans = 0;
        for(int j = 0; j<str.length(); j++) {
            if(str.charAt(j) == t.charAt(i)) {
                if(j>=n) ans++;
                i++;
            }
            if(i == t.length()) break;
        }
        return ans ;
    }
}