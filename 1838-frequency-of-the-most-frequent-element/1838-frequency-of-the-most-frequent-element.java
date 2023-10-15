class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        // Step 1: Create a list, sort it in descending order, and update the original array.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
            list.add(nums[i]);
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < nums.length; i++) 
            nums[i] = list.get(i);

        // Initialize variables for the sliding window approach.
        int left = 0;         // Left pointer for the window.
        int diff = 0;         // Stores the difference between the previous and current left values.
        int maxFrequency = 1; // Initialize maxFrequency to 1, as any single element can have a frequency of 1.
        int need = 0;         // Stores the difference between nums[left] and nums[right].

        // Step 2: Iterate through the array with the right pointer.
        for (int right = 1; right < nums.length; right++) {
            // Calculate the need, i.e., how much to increment nums[right] to make it equal to nums[left].
            need = nums[left] - nums[right];

            // Step 3: While the need is greater than k, shrink the window by moving the left pointer.
            while (need > k) {
                left++;
                // Calculate the difference between the previous and current left values.
                diff = nums[left - 1] - nums[left];
                // Update k by adding the charge (diff) for the removed element.
                k = k + diff * (right - left);
                // Recalculate the need after shrinking the window.
                need = nums[left] - nums[right];
            }

            // Step 4: Update k and maxFrequency for the current window.
            // Deduct need from k and update maxFrequency when a valid window is found.
            k = k - need;
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        // Step 5: Return the maximum frequency found in any valid window.
        return maxFrequency;
    }
}