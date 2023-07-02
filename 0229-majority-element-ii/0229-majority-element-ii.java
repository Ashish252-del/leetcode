class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length/3;
        HashMap<Integer, Temp> h = new HashMap<>();
        for(int i =0; i<nums.length; i++) {
            if(h.containsKey(nums[i])){
                h.put(nums[i],  new Temp(h.get(nums[i]).freq+1, h.get(nums[i]).index));
            }
            else h.put (nums[i], new Temp (1, i));
        }
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(Map.Entry<Integer,Temp> e: h.entrySet()) {
            Temp a = e.getValue();
            if(a.freq>n) pq.add(a.index);
        }
        while(!pq.isEmpty()) ans.add(nums[pq.poll()]);
        return ans;
    }
    
}
 class Temp {
     int freq ; int index ;
     public Temp (int freq, int index) {
         this.freq = freq; this.index = index;
     }
 }