class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List <Integer> ans = new ArrayList<>(k);
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i<k; i++) pq.add(Math.abs(x-arr[i]));
        
        for(int i =k ;i<arr.length; i++) {
            int curr = Math.abs(x-arr[i]);
            if(curr<pq.peek()) {pq.poll(); pq.add(curr);}
        }
       for(int i =0; i<arr.length; i++) {
                      int curr = Math.abs(x-arr[i]);
        if(pq.contains(curr)) {ans.add(arr[i]); pq.remove(curr);}
       }
        return ans ;
    }
}