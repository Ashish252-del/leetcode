class Solution {
    public int[] nextGreaterElements(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
         for(int i = 0; i<nums.length;i++) arr.add(nums[i]);
        for(int i = 0; i<nums.length-1;i++) arr.add(nums[i]);
        Stack<Integer> h = new Stack<>();
        for(int i =arr.size()-1; i>=0; i--) {
            while(h.size() !=0 && h.peek()<=arr.get(i)) h.pop();
            if(i < nums.length) {
                if(h.size() ==0) nums[i] = -1;
                else nums[i] = h.peek();
            }
            h.push(arr.get(i));
        }
        return nums;
    }
}