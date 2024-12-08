class Solution {
    public int makeConnected(int n, int[][] connections) {
        DS  d = new DS (n);
        int cntEx = 0;
        for(int i =0; i<connections.length; i++) {
            int u = connections[i][0];
            int v = connections[i][1];
          if(d.findPar(u) ==  d.findPar(v)) cntEx++;
          else {
              d.union(u,v);
          }  
        }
        int cnt = 0;
        for(int i =0; i<n; i++) {
            if(d.findPar(i) == i) cnt++;
        }
        return (cntEx>=cnt-1)?cnt-1:-1;
    }
}

class DS {
    ArrayList<Integer> s ;
    ArrayList<Integer> p ;
   DS(int n ) {
       s = new ArrayList<>();
       p = new ArrayList<>();
       for(int i =0; i<n; i++) {
          s.add(1);
          p.add(i);
       }
   }
   int findPar(int v ) {
        if(p.get(v) == v) return v;
        int pr = findPar(p.get(v));
        p.set(v,pr);
        return pr;
    }
   void union (int u , int v ) {
       if(findPar(u) ==  findPar(v)) return ;
       int upr = findPar(u);
       int vpr = findPar(v);
       if(s.get(upr)>s.get(vpr)) {
           p.set(vpr,upr);
           s.set(upr,s.get(upr)+s.get(vpr));
       }
       else {
            p.set(upr,vpr);
           s.set(vpr,s.get(upr)+s.get(vpr));
       }
   }
}