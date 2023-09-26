class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> h = new Stack<>();
        int ans = Integer.MIN_VALUE, curr = Integer.MIN_VALUE;
        for(int i =0; i<heights.length; i++) {
            while(!h.isEmpty() && heights[h.peek()]>heights[i]) {
                int t = h.pop();
                if(!h.isEmpty()) curr = heights[t]*((i-1)-h.peek());
                else curr = heights[t]*(i);
                ans = Math.max(ans,curr);
            }
            h.push(i);
        }
        while(!h.isEmpty()) {
            int t = h.pop();
             if(!h.isEmpty()) curr = heights[t]*((t-h.peek())+(heights.length-(t+1)));
                else curr = heights[t]*((t+1)+(heights.length-(t+1)));
            ans = Math.max(ans,curr);
        }
          return ans;

    }
}