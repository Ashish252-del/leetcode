class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> s = new HashMap<>();
        for(int i =0; i<strs.length; i++) {
            String a = sortStr(strs[i]);
           if(s.containsKey(a)) {
               List<String> curr = s.get(a);
               curr.add(strs[i]);
               s.put(a,curr);
           } 
            else s.put(a, new ArrayList<>(Arrays.asList(strs[i])));
        }
        for(Map.Entry<String,List<String> > e: s.entrySet()) {
            ans.add(e.getValue());
        }
        return ans;
    }
    public String sortStr  (String str) {
        char temp [] = str.toCharArray();
        Arrays.sort(temp);
        return new String (temp);
    }
}