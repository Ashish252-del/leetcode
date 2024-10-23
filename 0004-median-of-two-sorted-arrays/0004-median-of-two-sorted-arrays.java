class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to minimize binary search range
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            // Handle edge cases where partition is at the beginning or end
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            // Check if we have partitioned the arrays correctly
            if (maxX <= minY && maxY <= minX) {
                // If total length is even
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } 
                // If total length is odd
                else {
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                // We are too far on the right side of nums1, move left
                high = partitionX - 1;
            } else {
                // We are too far on the left side of nums1, move right
                low = partitionX + 1;
            }
        }

        // If we come here, it means the input arrays were not sorted
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
