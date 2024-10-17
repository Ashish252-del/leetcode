class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        arr.add(1);
        ans.add(arr);
        for(int i = 1; i<numRows; i++) {
            arr = new ArrayList<>();
            arr.add(1);
            for(int j =1 ; j<ans.get(i-1).size(); j++) {
                arr.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            arr.add(1);
           ans.add(arr);  
        }
        return ans ;
    }
}