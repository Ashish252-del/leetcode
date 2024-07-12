class Solution {
    public int maximumGain(String s, int x, int y) {
        char fav = 'a', nonfav = 'b';
        if(y>x) {fav = 'b'; nonfav = 'a';}
        Stack<Character> h = new Stack <>();
        int ans = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == nonfav && h.size()>0 && h.peek() == fav)  {
                h.pop();
                ans+=Math.max(x,y);
            }
            else h.push(s.charAt(i));
        }
         StringBuilder str = new StringBuilder();
        // for (Character ch : h) {str.append(ch);}
        // h.clear();
        while(h.size()>0) str.append(h.pop());
       // str.reverse();
        for(int i = str.length()-1; i>=0; i--) {
            if(str.charAt(i) == fav && h.size()>0 && h.peek() == nonfav)  {
                h.pop();
                ans+=Math.min(x,y);
            }
            else h.push(str.charAt(i));
        } 
        return ans;
    }
}