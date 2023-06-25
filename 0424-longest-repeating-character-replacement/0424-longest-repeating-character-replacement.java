class Solution {
    public int characterReplacement(String s, int k) {
       int start = 0, end = 0, max_freq =0; 
     int arr[] = new int [26];
        for(int i =0; i<s.length(); i++) {
            arr[s.charAt(i)-'A']++;
            max_freq = Math.max(max_freq,arr[s.charAt(i)-'A']);
           
            while((i -start +1) -max_freq>k) {
                 arr[s.charAt(start)-'A'] --;
                start++;
                
                
            }
            end = Math.max(end,i -start +1);
        }
        return end;
    }
}