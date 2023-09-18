class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length() != t.length()) return false;
        HashMap<Character, ArrayList<Integer>> h1 = new HashMap<>();
        HashMap<Character, ArrayList<Integer>> h2 = new HashMap<>();
        for(int i =0; i<s.length(); i++) {
            if(h1.containsKey(s.charAt(i))){
                ArrayList<Integer> temp =  h1.get(s.charAt(i));
                temp.add(i);
                    h1.put(s.charAt(i),temp);
            }
             if(h2.containsKey(t.charAt(i))){
                  ArrayList<Integer> temp =  h2.get(t.charAt(i));
                temp.add(i);
                    h2.put(t.charAt(i),temp);
             }
             if(!h1.containsKey(s.charAt(i))) h1.put(s.charAt(i), new ArrayList<>(Arrays. asList(i)));
             if(!h2.containsKey(t.charAt(i))) h2.put(t.charAt(i),  new ArrayList<>(Arrays. asList(i)));
        }
     for(int i =0; i<s.length(); i++) {
         if(!h1.get(s.charAt(i)).equals(h2.get(t.charAt(i)))) return false;
     }
        return true;
    }
}