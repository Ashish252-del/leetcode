class Solution {
    public int minTimeToType(String word) {
        int ans = word.length();
        int prev = 'a';
        for(int i =0; i<word.length(); i++ ){
            int curr = Math.abs(word.charAt(i) - prev);
            ans += Math.min(curr,Math.abs(26-curr));
          prev = word.charAt(i);  
        }
        return ans ;
    }
}