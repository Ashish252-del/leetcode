class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i =0; i<s.length(); i++){
            
            if (s.charAt(i)=='I'){
                if(i+1<s.length()&&s.charAt(i+1)=='V')
                { ans = ans + 4; i=i+1;}
                else if(i+1<s.length()&&s.charAt(i+1)=='X')
              {  ans = ans + 9; i=i+1;}
            else ans = ans+1;}
            
            else if (s.charAt(i)=='V') ans+= 5;
            
            else if (s.charAt(i)=='X'){
                 if(i+1<s.length()&&s.charAt(i+1)=='L')
                 { ans = ans + 40; i=i+1;}
               else if(i+1<s.length()&&s.charAt(i+1)=='C')
              {  ans = ans + 90; i=i+1;}
                else
                ans += 10;}
            
            else if (s.charAt(i)=='L') ans += 50;
            
            else if (s.charAt(i)=='C'){
                 if(i+1<s.length()&&s.charAt(i+1)=='D')
                 {ans = ans +400; i=i+1;}
               else if(i+1<s.length()&&s.charAt(i+1)=='M')
                 {ans = ans +900; i=i+1;}
                else
                ans += 100;}
            
            else if (s.charAt(i)=='D') ans += 500;
            
            else if (s.charAt(i)=='M') ans += 1000;
        }
        return ans;
    }
}