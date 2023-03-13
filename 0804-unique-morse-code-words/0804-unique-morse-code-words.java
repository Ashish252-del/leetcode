class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String str [] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet <String> s = new HashSet<>();
       
        for(int i =0; i<words.length; i++) {
             String t = "";
            for(int j =0; j<words[i].length(); j++)
            t += str[(words[i].charAt(j))-97];
            s.add(t);
        }
        return s.size();
    }
}