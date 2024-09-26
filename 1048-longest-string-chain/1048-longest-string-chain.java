class Solution {
    public int longestStrChain(String[] words) {
      Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        int temp [] = new int[words.length];
        temp[0] = 1;
        for(int i =1; i<words.length; i++) {
            temp[i] = 1;
            for(int j =i-1; j>=0; j--) {
                if(isPredecessor(words[j],words[i])) {
                    temp[i] = Math.max(temp[i], temp[j]+1);
                }
            }
          
        }
          int ans =0;
            for(int i =0; i<temp.length; i++)
                ans = Math.max(ans,temp[i]);
            return ans ;
    }
    
    boolean isPredecessor (String s , String t) {

        int i = 0;
        int j = 0;

        if(t.length() != s.length()+1) return false;

         while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return  i == s.length();
    
    }
}