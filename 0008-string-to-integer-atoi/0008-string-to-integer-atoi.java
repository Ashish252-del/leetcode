class Solution {
    public int myAtoi(String s) {
        int i = 0;
        Boolean isPos = true;

        while(i < s.length() && s.charAt(i) == ' ')
            i++;

        if(i == s.length())
            return 0;

        if(s.charAt(i) == '-'){
            isPos = false;
            i++;
        }
        else if(s.charAt(i) == '+')
            i++;

        long ans = 0;

        for(; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9')
                break;

            ans = ans*10 + s.charAt(i)-'0';

            if(isPos && ans > (Math.pow(2, 31)-1)){
                ans = (long)(Math.pow(2, 31)-1);
                break;
            }
            else if(!isPos && ans > Math.pow(2, 31)){
                ans = (long)Math.pow(2, 31);
                break;
            }
        }

        if(!isPos)
            return (int)(-1*ans);

        return (int)ans;
    }
}