class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i<gifts.length; i++) pq.add(gifts[i]);
        while(k-->0) {
            int a = pq.poll();
            pq.add((int)(Math.pow(a,0.5)));
        }
        long ans = 0;
        while(pq.size()>0) ans+=pq.poll();
        return ans;
    }
}