class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> h = new HashSet<>();
        for(int i =0; i<arr.length; i++) h.add(arr[i]);
        int i =1;
        while(k>0) {
            if(!h.contains(i)) k--;
            i++;
        }
        return i-1;
    }
}