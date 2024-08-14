class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0 , tn =0 , tw = 0;
        for(int i =0 ; i<bills.length; i++) {
            if(bills[i] == 5) f++;
            else if(bills[i] == 10) {
                if(f == 0) return false;
                f--;
                tn++;
            }
            else if(bills[i] == 20) {
                if(f == 0) return false;
                if(tn == 0 && f<3) return false;
                if(tn !=0)
               { tn--;
                tw++;
               f--;}
                else {
                    f -=3;
                }
            }
        }
        return true;
    }
}