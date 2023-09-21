class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> h = new Stack<>();
        HashMap <Integer, Integer> ans  = new HashMap<>(); 
        for(int i = nums2.length-1; i>=0; i--) {
            while(h.size() !=0 && h.peek() < nums2[i]) h.pop();
            if(h.size() ==0) ans.put(nums2[i], -1);
            else ans.put(nums2[i], h.peek());
            h.push(nums2[i]);
        }
       for(int i =0; i<nums1.length; i++) {
           int t = nums1[i];
           nums1[i] = ans.get(t);
       }
        return nums1;
    }
}