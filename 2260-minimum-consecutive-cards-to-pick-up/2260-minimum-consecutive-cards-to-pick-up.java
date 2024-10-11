class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans = Integer.MAX_VALUE;
        int l =0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i =0; i<cards.length; i++) {
            if(!h.containsKey(cards[i])) h.put(cards[i],i);
            else {
                ans = Math.min(ans , i-h.get(cards[i])+1);
                h.put(cards[i],i);
            }
        }
        if(ans == Integer.MAX_VALUE) return -1;
        return ans ;
    }
}