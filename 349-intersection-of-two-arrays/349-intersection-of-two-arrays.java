class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();
        for(int i =0; i<nums1.length; i++)
            al.add(nums1[i]);
         for(int i =0; i<nums2.length; i++)
        if(al.contains(nums2[i])) s.add(nums2[i]);
        int a [] = new int [s.size()];
        int i =0;
     for (Integer e :s) {a[i] = e; i++;};
        return a;
    }
}