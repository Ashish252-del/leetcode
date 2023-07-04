class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Integer> b = new ArrayList<>();
         ArrayList <Integer> c = new ArrayList<>();
        for(int i =0; i<nums.length; i++) {
            if(nums[i]<pivot) a.add(nums[i]);
            else if ( (nums[i]==pivot)) b.add(nums[i]);
            else c.add(nums[i]);
        }
     int i =0, j=0, l=0,k=0;
       while(i<a.size()){ nums[k] = a.get(i); k++; i++;}
        while(j<b.size()) {nums[k]=b.get(j); j++; k++;}
         while(l<c.size()) {nums[k]=c.get(l); l++; k++;}
        return nums ;
    }
}