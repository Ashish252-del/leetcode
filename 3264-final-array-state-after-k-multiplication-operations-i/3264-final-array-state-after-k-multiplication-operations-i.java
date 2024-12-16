class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
      PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i =0; i<nums.length; i++) pq.add(new Pair(nums[i],i));
        while(k-->0) {
            Pair t = pq.poll();
            pq.add(new Pair (multiplier*t.num, t.i));
        }
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            nums[p.i] = p.num;
        }
        return nums;
    }
}

class Pair implements Comparable<Pair>{
    int num; int i ;
    public Pair (int num , int i ) {
        this.i =i;
        this.num = num ;
    }
    public int compareTo(Pair p ) {
        if(this.num == p.num) return this.i - p.i;
        return this.num - p.num;
    }
}