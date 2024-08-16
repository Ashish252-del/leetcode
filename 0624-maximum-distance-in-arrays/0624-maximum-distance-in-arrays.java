class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);

            // Calculate the maximum possible distance
            ans = Math.max(ans, Math.abs(currentMax - minVal));
            ans = Math.max(ans, Math.abs(maxVal - currentMin));
            
            // Update global min and max
            minVal = Math.min(minVal, currentMin);
            maxVal = Math.max(maxVal, currentMax);
        }
        
        return ans;
    }
}

