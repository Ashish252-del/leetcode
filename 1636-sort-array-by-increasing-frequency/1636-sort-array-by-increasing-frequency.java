class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            if(m.containsKey(nums[i])) {
                int t = m.get(nums[i]);
                t++;
                m.put(nums[i],t);
            }
             else {
         
            m.put(nums[i],1);
        }
        }
        PriorityQueue<Sol> pq = new PriorityQueue<>();
   for(int i =0; i<nums.length; i++) {
      if(m.containsKey(nums[i])){ pq.add(new Sol(nums[i], m.get(nums[i])));
                                m.remove(nums[i]);}
   }
        int i =0;
     while(pq.size()>0) {
         int t = pq.peek().f;
         while (t-- >0) {nums[i] = pq.peek().n; i++;}
         pq.remove();
     }
        return nums;
    }
    
}

public class Sol implements Comparable<Sol> {
   public int n = 0;
   public int f = 0;
    public Sol (int n , int f) {
       this.n = n;
        this.f = f;
    }
    @Override
    public int compareTo(Sol other) {
        if(this.f == other.f) return other.n - this.n ;
        return this.f - other.f; // compare by name
    }
}