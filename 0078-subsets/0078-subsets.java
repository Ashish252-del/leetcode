class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        solve(arr, n , ans, 0, nums);
        return ans;
    }
    void solve (List<Integer> arr , int n ,  List<List<Integer>> ans  , int i, int nums []) {
        if(i == n) {
            ans.add(arr);
            return;
        }
       if(i<n) solve(arr, n, ans , i+1, nums);
         List<Integer> temp = new ArrayList<>();
        for(int j =0; j<arr.size(); j++)
        temp.add(arr.get(j));
        temp.add(nums[i]);
       if(i<n) solve(temp, n, ans , i+1, nums);
    }
}