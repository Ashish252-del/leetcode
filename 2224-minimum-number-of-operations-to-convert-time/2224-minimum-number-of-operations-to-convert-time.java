class Solution {
    public int convertTime(String current, String correct) {
     int hr = Integer.parseInt(correct.substring(0,2))-Integer.parseInt(current.substring(0,2));
        int min = Integer.parseInt(correct.substring(3))-Integer.parseInt(current.substring(3));
        int total = hr*60 + min;
        int ans =0; 
        while(total>0) {
            if(total>=60) {total = total- 60; }
            else if (total>=15){ total = total-15;}
            else if(total>=5) {total= total-5;}
            else{ total = total -1;}
            ans++;
        }
        return ans;
        
    }
}