class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
       ArrayList<Sorter> arr = new ArrayList<>();
        for(int i = 0; i<nums.length; i++) arr.add(new Sorter(nums[i], mapping , i));
        Collections.sort(arr);
        for(int i =0; i<arr.size(); i++) {
            nums[i] = arr.get(i).n;
        }
        return nums;
    }
    
}

class Sorter implements Comparable<Sorter> {
    int n = 0;
    int m = 0 ;
    int i = 0;
public Sorter (int n , int arr [] , int i ) {
    this.n = n;
    this.m = this.mapper(n , arr);
    this.i = i;
}   
  public int mapper (int n , int[] arr){
      int curr = 1 ; int num = 0;
      if( n== 0) return arr[0];
      while (n > 0) {
          num = num + (curr*(arr[n%10]));
          n= n/10;
          curr = curr*10;
      }
      return num;
  }   
 public int compareTo (Sorter that) {
     // if(this.m == that.m) return this.n - that.n;
    return this.m - that.m;
 }
}