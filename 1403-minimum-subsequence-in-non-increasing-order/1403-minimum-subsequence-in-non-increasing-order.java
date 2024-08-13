class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int arr []= new int [nums.length];
        arr[0] = nums[arr.length-1];
        sum = arr[0];
        int j = 1;
        for(int i =arr.length-2; i>=0; i--) {
            sum+=nums[i];
            arr[j] = nums[i]+arr[j-1];
            j++;
        }
        for(int i =0; i<arr.length; i++) {
            ans.add(nums[arr.length -1 - i]);
            if(arr[i] > sum - arr[i]) break;
        }
        return ans;
    }
}