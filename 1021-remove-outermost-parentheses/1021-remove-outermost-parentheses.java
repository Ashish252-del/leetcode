class Solution {
    public String removeOuterParentheses(String s) {
      String ans = "";
        int len = 0; int st = 0, end = s.length()-1;
        
        for(int i =0; i<s.length(); i++) {
            if(s.charAt(i) =='(') len++;
            else len--;
            if(len ==0 && st+1 <s.length()) {ans+=s.substring(st+1,i);
                        st = i+1;}
        }
        return ans ;
    }
}