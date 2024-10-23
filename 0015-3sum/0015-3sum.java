class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       // HashSet<List<Integer>> h = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) { // We need at least 3 numbers to form a triplet
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1; // Left pointer
            int h = nums.length - 1; // Right pointer
            
            while (l < h) {
                int sum = nums[i] + nums[l] + nums[h];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    
                    // Skip duplicates for the left pointer
                    while (l < h && nums[l] == nums[l + 1]) l++;
                    // Skip duplicates for the right pointer
                    while (l < h && nums[h] == nums[h - 1]) h--;
                    
                    l++;
                    h--;
                } else if (sum < 0) {
                    l++; // Move left pointer to the right to increase the sum
                } else {
                    h--; // Move right pointer to the left to decrease the sum
                }
            }
        }
        
        return ans;
    }
}