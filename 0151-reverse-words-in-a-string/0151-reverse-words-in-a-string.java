class Solution {
    public String reverseWords(String s) {
        char str [] = s.toCharArray();
        int st = 0; 
        for(int i =0; i<str.length; i++) {
            if(str[i] == ' ') {rev(str, st , i-1); st = i+1;}
        }
        rev(str, st , str.length-1);
       rev(str, 0 , str.length-1);
        String ans = "";
        for(int i =0; i<str.length; i++) {
            if(i>0 && (str[i] ==' ' && str[i-1] == ' ')) continue;
            ans+=str[i];}
        return ans.trim();

    }
    
    public void rev(char arr [] , int l , int r) {
        while(r>l) {
           char temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
            l++; r--;
        }
    }
}