class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i =0; i<nums1.length; i++) {
            if(h.containsKey(nums1[i])) h.put(nums1[i], h.get(nums1[i])+1);
            else h.put(nums1[i], 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0 ; i<nums2.length; i++) {
            if(h.containsKey(nums2[i])) {
                if(h.get(nums2[i]) == 1) h.remove(nums2[i]);
                else  h.put(nums2[i], h.get(nums2[i])-1);
                ans.add(nums2[i]);
            }
        }
         int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}