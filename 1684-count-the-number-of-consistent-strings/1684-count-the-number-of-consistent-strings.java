class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> s = new HashSet<>();
        for(int i =0; i<allowed.length(); i++)
            s.add(allowed.charAt(i));
        int ans = 0;
        for(int i =0; i<words.length; i++) {
            boolean check = true;
            for(int j=0; j<words[i].length(); j++){
                if(!s.contains(words[i].charAt(j))) check = false;
            }
            if(check) ans++;
        }
        return ans;
    }
}