class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>ans = new ArrayList<>();
      HashMap <Integer, ArrayList<Integer> > h = new HashMap<>();
        for(int i =0; i<groupSizes.length; i++) {
            if(h.containsKey(groupSizes[i])){
                  ArrayList<Integer> temp = h.get(groupSizes[i]);
                temp.add(i);
                h.put(groupSizes[i],temp);}
            else { ArrayList<Integer> arr = new ArrayList<>();
                  arr.add(i);
                h.put(groupSizes[i],arr );}
        }
        for(Map.Entry<Integer, ArrayList<Integer>> e: h.entrySet()){
            int a = e.getKey();
            int b = e.getValue().size();
            int len = b/a;
            for(int i=0; i<len; i++) {
                ArrayList<Integer> temp = new ArrayList<>();
                int j = 0;
                for(; j<a; j++) {
                    temp.add(e.getValue().get(j));
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}