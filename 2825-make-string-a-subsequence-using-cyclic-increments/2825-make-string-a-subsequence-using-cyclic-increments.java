class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
       // if(str1.length()!= str2.length()) return false;
       int m = 0;
        for(int i =0; i<str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(m);
            if(a == b) m++;
            else if (a <'z' && a+1 == b) m++;
            else if (a == 'z' && b == 'a') m++;
            if(m == str2.length()) return true;
        }
        return false;
    }
}