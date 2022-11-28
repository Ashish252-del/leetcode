class Solution {
    public int lengthOfLastWord(String s) {
       int cnt =0;
        int i =s.length()-1;
        while(s.charAt(i)==' ') i--;
        for(; i>=0; i--)
        { cnt++;
            if(s.charAt(i)==' ') {cnt--; break;}
         else if (i==0){ break;}
        }
        return cnt;
    }
}