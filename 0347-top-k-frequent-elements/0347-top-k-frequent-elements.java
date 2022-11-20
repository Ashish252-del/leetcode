class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
     int [] ans = new int[k];
      TreeMap<Integer,Integer> t = new TreeMap<>();
      for(int i =0; i<n; i++){
          if(t.containsKey(nums[i])) t.put(nums[i],t.get(nums[i])+1);
          else {t.put(nums[i], 1);}
      }
      // convert hashmap into list
      List<Map.Entry<Integer,Integer>> list = new ArrayList<>(t.entrySet());
      
      Collections.sort(list, new sort());
     
  for (int i =0; i<k; i++){
      Map.Entry<Integer,Integer> curr = list.get(i);
     ans[i] = curr.getKey();
   
        
    }
       return ans;  
    }
}
class sort implements Comparator< Map.Entry<Integer,Integer>>{
    
       
        public int compare(Map.Entry<Integer,Integer>e1, Map.Entry<Integer,Integer>e2 ) {
        return e2.getValue() - e1.getValue(); }
}