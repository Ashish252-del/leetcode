class KthLargest {
      ArrayList<Integer> al ;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        al =  new ArrayList<>();
        for(int i =0; i<nums.length; i++) al.add(nums[i]);
        Collections.sort(al);
    }
    
    public int add(int val) {
        al.add(val);
        Collections.sort(al);
      return al.get(al.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */