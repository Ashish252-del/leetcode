class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<String,Integer> ans = new HashMap<>();
             for(int j =0; j<words[0].length(); j++) {
                 if(ans.containsKey(words[0].charAt(j)+""))                                                            ans.put(words[0].charAt(j)+"",ans.get(words[0].charAt(j)+"")+1);
              else ans.put(words[0].charAt(j)+"",1);
            
        }
        for(int i =1; i<words.length; i++) {
            HashMap<String,Integer> temp = new HashMap<>();
            for(int j =0; j<words[i].length(); j++) {
                if(ans.containsKey(words[i].charAt(j)+"")) {
                 if(temp.containsKey(words[i].charAt(j)+""))                                                            temp.put(words[i].charAt(j)+"",Math.min(temp.get(words[i].charAt(j)+"")+1,
                 ans.get(words[i].charAt(j)+"")));
              else temp.put(words[i].charAt(j)+"",1);
                }
            }
            ans = temp;
        }
          ArrayList<String> arr = new ArrayList<>();
         for (Map.Entry<String, Integer> e :
             ans.entrySet()) {
               int cnt = e.getValue();
             while(cnt-- >0) arr.add(e.getKey());
        }
        return arr;
    }
}