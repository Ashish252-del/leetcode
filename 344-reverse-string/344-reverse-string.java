class Solution {
    public void reverseString(char[] s) {
     int i =0, j = s.length-1;
        while(j>i){
            char a = s[i];
            s[i] = s[j];
            s[j] = a;
            i++;
            j--;
        }
    }
}