class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
      //  Arrays.sort(arr);
        int zerocnt = 0;
        for(int i =arr.length-1; i>=0; i--) {
           if(arr[i]!=0) h.add(arr[i]);
            if(arr[i] == 0) zerocnt++;
            if(zerocnt == 2) return true;
        }
        
        for (int i =0; i<arr.length; i++) {
             if(h.contains(arr[i]*2)) return true;
        }
        return false;
    }
}