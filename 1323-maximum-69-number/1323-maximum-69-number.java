class Solution {
    public int maximum69Number (int num) {
        boolean t = true;
        int temp = 0, ans =0;
        while(num>0) {
            temp = temp*10 + num%10;
            num = num/10; 
        }
        while (temp>0) {
            if(temp%10==6 && t) { ans = ans*10 + 9; t=false;}
             else ans = ans*10 + temp%10;
            temp = temp/10;
        }
        return ans ;
    }
}