class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
    PriorityQueue<Pair> pq = new PriorityQueue<>();
        int d[] = new int [n];
             Arrays.fill(d,Integer.MAX_VALUE);
             pq.add(new Pair (0,k,0));
             d[k-1] = 0;
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            for(int i = 0; i<times.length; i++)
              { if(times[i][0] == p.i)
                {
                int r = times[i][1], cost = times[i][2]+p.time;
              if(d[r-1] > cost  ) 
             {    d[r-1] = cost;
                  pq.add( new Pair (cost,r,0));
             }
                }
              }
        
        }
            int ans = 0;
            for(int i =0; i<d.length; i++) ans = Math.max(ans,d[i]);
         return (ans == Integer.MAX_VALUE)?-1:ans;   
            }
}
class Pair implements Comparable<Pair> {
    int i ;
    int j ;
    int time ;
    public Pair (int time ,  int i , int j ) {
        this.time = time;
        this.i = i;
        this.j = j;
    }
    public int compareTo (Pair p ) {
        return this.time - p.time;
        
    }
}