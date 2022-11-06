class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans =0;
       HashSet<Character> h = new HashSet<>();
        for(int i=0; i<jewels.length(); i++)
            h.add(jewels.charAt(i));
        for(int i =0; i<stones.length(); i++){
            if(h.contains(stones.charAt(i))) ans++;
        }
        return ans;
    }
}