class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<Pair> arr =  new ArrayList<>(), ans = new ArrayList<>();
        for(int i =0; i<intervals.length; i++) {
            arr.add(new Pair(intervals[i][0], intervals[i][1]));
        }
        Collections.sort(arr);
        int temp_s = arr.get(0).start;
        int temp_e = arr.get(0).end;
        for(int i =0 ; i<arr.size(); i++) {
            Pair curr = arr.get(i);
            if(curr.start<=temp_e) {
                temp_e = Math.max(curr.end,temp_e);
            }
            else {
                  ans.add(new Pair(temp_s, temp_e));
                temp_s = curr.start;
                temp_e = curr.end;
              
            }
        }
          ans.add(new Pair(temp_s, temp_e));
        int res [] [] = new int [ans.size()][2];
        for(int i =0; i<ans.size(); i++) {
            res[i][0] = ans.get(i).start;
            res[i][1]= ans.get(i).end;
        }
        return res;
    }
}

class Pair implements Comparable<Pair> {
    int start ; int end ;
    public Pair (int start , int end ) {
        this.start = start ; 
        this.end = end ;
        
    }
    public int compareTo (Pair a) {
        return this.start - a.start;
    }
}