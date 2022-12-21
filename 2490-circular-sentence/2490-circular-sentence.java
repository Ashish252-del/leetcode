class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)) return false;
      String[] str = sentence.split(" ");
        
        for(int i =1; i<str.length; i++){
            if((str[i-1].charAt(str[i-1].length()-1))!=(str[i].charAt(0))) return false;
        }
        return true;
    }
}