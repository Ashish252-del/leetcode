class Solution {
    public int findTheWinner(int n, int k) {
         ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1; i<=n; i++) arr.add(i);
        return solve (arr, k , 0);
    }
    int solve(ArrayList<Integer>arr, int k , int i){
       if(arr.size()==1) return arr.get(0);
       i = (i+k-1)%arr.size();
       arr.remove(i);
      return solve(arr,k,i);
   }
}