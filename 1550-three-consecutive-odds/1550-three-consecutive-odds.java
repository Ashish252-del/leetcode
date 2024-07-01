class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        return isThere(arr, 0, 0);
    }
    
    boolean isThere (int[]arr, int cnt , int i ) {
        if(cnt >=3) return true; 
        if(arr.length <= i ) return false ; 
        if(arr[i] % 2 != 0) return isThere(arr, cnt+1 , i+1);
        else return isThere(arr, 0 , i+1);
    }
}