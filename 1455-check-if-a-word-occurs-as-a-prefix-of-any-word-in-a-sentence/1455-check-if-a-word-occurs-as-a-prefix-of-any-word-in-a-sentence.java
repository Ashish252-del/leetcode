class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int cnt = 1;
        for (String word :words) {
           if(word.indexOf(searchWord)==0) return cnt;
            cnt++;
        }
        return -1;
    }
}