class Solution {
    public int maxDistance(int[] colors) {
        HashSet<Integer> s = new HashSet<>();
        int ans = 0;
        for(int i =0; i<colors.length; i++) {
            if(!s.contains(colors[i])) {
                int curr = 0;
                for(int j =i+1; j<colors.length; j++){
                    if (colors[j]!=colors[i]) curr = j-i;
                }
                ans = Math.max(ans,curr);
            }
        }
        return ans;
    }
}