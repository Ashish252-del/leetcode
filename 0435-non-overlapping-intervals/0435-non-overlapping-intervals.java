class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        ArrayList<Pair> arr = new ArrayList<>();
        for(int i =0 ;i<intervals.length; i++) {
            Pair p = new Pair(intervals[i][0],intervals[i][1]);
            arr.add(p);
        }
        Collections.sort(arr);
       int prev = 0, ans =0;
        // [1,3] [2,4]
        //  [2,9] [3,4]
        //[1,2] [3,4]
        for(int i =1; i<arr.size(); i++){
            if(arr.get(prev).r>arr.get(i).l){
                ans++;
                if(arr.get(prev).r>arr.get(i).r) prev = i;
            }
            else {
                prev = i;
            }
        }
        return ans;
    }
}

class Pair implements Comparable <Pair>{
    int l ; int r ;
    public Pair (int l , int r) {
        this.l = l ; this.r = r;
    }
    public int compareTo(Pair that) {
        if(this.l != that.l) return this.l - that.l; 
        return this.r - that.r;
    }
}