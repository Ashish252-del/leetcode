class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer> h = new HashSet<>();
        for(int i =0; i<candyType.length; i++) {
            h.add(candyType[i]);
        }
        if(h.size()>=candyType.length/2) return candyType.length/2;
        return h.size();
    }
}