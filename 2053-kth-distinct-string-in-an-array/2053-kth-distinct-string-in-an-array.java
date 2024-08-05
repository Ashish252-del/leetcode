class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> h = new HashMap<>();
        for(int i =0; i<arr.length; i++) {
            if(h.containsKey(arr[i])) h.put(arr[i], h.get(arr[i])+1);
            else h.put(arr[i],1);
        }
        String ans = "";
        for(int i =0; i<arr.length; i++) {
           if(h.get(arr[i]) == 1) k--;
            if(k==0) return arr[i];
        } 
        return ans ;
    }
}