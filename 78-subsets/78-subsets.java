class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> arr = new ArrayList<>();
        
    for(int i=0; i<Math.pow(2,nums.length); i++){
        arr.add(new ArrayList<>());
         int cnt = 1;
      for(int j =0; j<nums.length; j++){
          if((i&cnt<<j)!=0) arr.get(i).add(nums[j]);
          
          }
    }  
        return arr;
    }
}