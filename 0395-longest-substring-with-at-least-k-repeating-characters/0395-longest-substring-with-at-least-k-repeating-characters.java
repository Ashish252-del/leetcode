class Solution {
    public int longestSubstring(String s, int k) {
        if(k==1) return s.length();
        int arr [] = new int [26];
        return helper(s, 0, s.length(), k, arr);
    }
   public int helper(String s, int start, int end ,int k, int [] arr) {
        if(start>=end) return 0;
        Arrays.fill(arr,0);
        for(int i = start; i<end; i++) arr[s.charAt(i)-'a']++;
        for(int i =start; i<end; i++) {
            if (arr[s.charAt(i)-'a']<k) {return Math.max(helper(s,start,i,k,arr), helper(s,i+1,end,k,arr));}
        }
        return end - start;
    }
}