class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      HashMap<Integer,Integer> m= new HashMap<>();
    int[] nums1= nums.clone();
    Arrays.sort(nums);
    int[] result= new int[nums.length];
    for(int i=0;i<nums.length;i++){
        if(!m.containsKey(nums[i])){
        m.put(nums[i],i);
        }
    }
    for(int j=0;j<nums.length;j++){
        result[j]=m.get(nums1[j]);
    }
    
    return result;
       
    }
}