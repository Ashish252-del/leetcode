class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> h = new Stack<>();
        int cnt = 0;
        for (int i =0; i<s.length(); i++) {
            if(s.charAt(i) == ')') {
                if(h.size()>0) h.pop();
                else cnt++;
            }
            else h.add('(');
        }
        return cnt+h.size();
    }
}