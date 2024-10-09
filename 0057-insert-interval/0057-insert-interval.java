
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> arr = new ArrayList<>();

        // If intervals is empty, just return the newInterval as the result
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        boolean newIntervalAdded = false;
        int i = 0;
        int n = intervals.length;

        // Add all intervals that come before newInterval without any overlap
        while (i < n && intervals[i][1] < newInterval[0]) {
            arr.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals including the newInterval
        int[] mergedInterval = newInterval;
        while (i < n && intervals[i][0] <= newInterval[1]) {
            mergedInterval[0] = Math.min(mergedInterval[0], intervals[i][0]);
            mergedInterval[1] = Math.max(mergedInterval[1], intervals[i][1]);
            i++;
        }
        arr.add(mergedInterval);  // Add the merged interval
        newIntervalAdded = true;

        // Add all intervals that come after newInterval without any overlap
        while (i < n) {
            arr.add(intervals[i]);
            i++;
        }

        // Convert ArrayList to 2D array
        int[][] result = new int[arr.size()][2];
        for (int j = 0; j < arr.size(); j++) {
            result[j] = arr.get(j);
        }

        return result;
    }
}