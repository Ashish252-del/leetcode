class Solution {
    public String customSortString(String order, String s) {
         String ans = "";
       Map<Character,Integer> m = new HashMap<>();
        for(int i =0; i<s.length(); i++) {
            char a = s.charAt(i);
            if(m.containsKey(a)) m.put(a,m.get(a)+1);
            else m.put(a,1);
        }
        for(int i =0; i<order.length(); i++){
            char b = order.charAt(i);
            if(m.containsKey(b)) {
                int curr = m.get(b);
                while(curr-->0) ans = ans+b;
               m.remove(b);
            }
        }
       for(Map.Entry<Character,Integer> e: m.entrySet()){
           int curr = e.getValue();
           while(curr-->0) ans = ans+e.getKey();
       }
      return ans;      
    }
}