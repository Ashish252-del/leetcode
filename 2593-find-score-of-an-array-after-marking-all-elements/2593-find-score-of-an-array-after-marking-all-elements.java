class Solution {
    public long findScore(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
       for(int i =0; i<nums.length; i++) {
           pq.add(new Pair(i, nums[i]));
       }
        long ans = 0;
        while(pq.size()>0) {
            Pair t = pq.poll();
            if(!h.contains(t.i)) {
                h.add(t.i);
                if(t.i-1>=0) h.add(t.i-1);
                if(t.i+1<nums.length) h.add(t.i+1);
                ans+=t.el;
            }
        }
        return ans ;
    }
}

class Pair implements Comparable<Pair> {
    int i ; 
    int el;
    public Pair(int i , int el) {
        this.i = i;
        this.el = el;
    }
    public int compareTo(Pair p) {
        if(this.el == p.el) return this.i - p.i;
        return this.el-p.el;
    }
}