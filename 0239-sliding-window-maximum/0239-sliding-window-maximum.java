class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> h = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
       // int ans [] = new int [nums.length];
        for(int i =0; i<k; i++) {
            while(!h.isEmpty() && nums[h.peekLast()] <= nums[i]) h.pollLast();
            h.offerLast(i);
        }
        for(int i = k; i<nums.length; i++) {
            ans.add(nums[h.peek()]);
            while(!h.isEmpty() && i - h.peek() >=k ) h.poll();
        while(!h.isEmpty() && nums[h.peekLast()] <= nums[i]) h.pollLast();
            h.offerLast(i);
        }
        ans.add(nums[h.peek()]);
        int arr [] = new int [ans.size()];
        for(int i = 0; i<arr.length; i++)
            arr[i] = ans.get(i);
        return arr;
    }
}