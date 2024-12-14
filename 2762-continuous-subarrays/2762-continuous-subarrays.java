class Solution {
  public long continuousSubarrays(int[] nums) {
    final int n = nums.length;
    long result = 0;
    TreeMap<Integer, Integer> count = new TreeMap<>();
    for (int i = 0, j = 0; i < n; i++) {
      count.merge(nums[i], 1, Integer::sum);
      while (!count.isEmpty() && count.lastEntry().getKey() - count.firstEntry().getKey() > 2) {
        if (count.merge(nums[j], -1, Integer::sum) == 0) {
          count.remove(nums[j]);
        }
        j++;
      }
      result += i - j + 1;
    }

    return result;
  }
}