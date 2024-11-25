class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       PriorityQueue<Pair> pq = new PriorityQueue<>();
        int d[][] = new int [n][n+1];
        for(int i = 0; i<n; i++) Arrays.fill(d[i],Integer.MAX_VALUE);
        for(int i = 0; i<flights.length; i++) {
            if(flights[i][0] == src) {
                d[src][0] = 0;
             pq.add(new Pair (0,0,src,0));
             break;  
            }
        }
       int ans = Integer.MAX_VALUE;
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            if(p.i == dst) ans = Math.min(ans,p.cost);
            for(int i = 0; i<flights.length; i++)
              { if(flights[i][0] == p.i)
                {int r = flights[i][1], cost = flights[i][2]+p.cost, stop = p.stop+1;
              if(stop < n+1 && d[r][stop] > cost && k+1>=stop  ) 
             {    d[r][stop] = cost;
                  pq.add( new Pair (cost,stop,r,0));
             }
                }
              }
               
        
        }
        return (ans == Integer.MAX_VALUE)?-1:ans; 
    }
}
class Pair implements Comparable<Pair> {
    int i ;
    int j ;
    int cost ;
    int stop ;
    public Pair (int cost ,int stop,  int i , int j ) {
        this.cost = cost;
        this.i = i;
        this.j = j;
        this.stop = stop;
    }
    public int compareTo (Pair p ) {
      //  if(this.cost == p.cost ) return this.stop - p.stop;
        return this.cost - p.cost;
        
    }
}