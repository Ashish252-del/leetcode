class Solution {
    public int maxTwoEvents(int[][] events) {
     ArrayList<Pair> arr = new ArrayList<>();
        for(int i =0; i<events.length; i++) {
            arr.add(new Pair (events[i][0],events[i][1],events[i][2]));
        }
        Collections.sort(arr);
        int memo [][] = new int [arr.size()+1][3];
        for(int i =0; i<memo.length; i++) Arrays.fill(memo[i],-1);
        return solve(arr,0,0, memo);
    }
    
    public int solve (ArrayList<Pair> arr , int i , int cnt ,int memo [][]) {
        if(memo[i][cnt] !=-1) return memo[i][cnt];
        if(cnt == 2 || i == arr.size()) {
            memo[i][cnt] = 0;
            return 0;
        }
        int nextIndx = bS(arr , i+1, arr.get(i).ed);
        int take =  arr.get(i).v + solve(arr, nextIndx, cnt+1, memo);
        int nonTake = solve(arr, i+1, cnt, memo);
        memo[i][cnt] = Math.max(take , nonTake);
        return Math.max(take , nonTake);
    }
    int bS (ArrayList<Pair> arr , int l, int ed) {
        int r = arr.size()-1;
        int res = r+1;
        while(r>=l)
              {
            int m = (l+r)/2;
            if(arr.get(m).st > ed) {
                res = m;
                r = m-1;
            }
            else l = m+1;
        }
              return res;
    }
}

class Pair implements Comparable<Pair> {
    int st =0;
    int ed = 0;
    int v = 0;
    Pair (int st, int ed, int v ) {
        this.st = st;
        this.ed = ed;
        this.v = v ;
    }
   public int compareTo (Pair P) {
       return this.st - P.st;
   } 
}