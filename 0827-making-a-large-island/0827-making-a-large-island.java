class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        DS ds = new DS(n*n);
         int ans = grid[0][0];
        int dir [][] =  {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i =0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(grid[i][j] != 1) continue;
                int u = (i*n) + j;
            for (int [] d: dir) {
                int p = i+d[0];
                int q = j+d[1];
             if(p>=0 && p<n && q>=0 && q<n) {
                if(grid[p][q] == 1) {int v = (p*n) + q;
                 ds.union(u,v);
                ans = Math.max(ans, ds.size.get(ds.findPar(u))) ;            
                                     }
             }
            }    
            }
            
        }
      
        for(int i =0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                int curr = 1;
                if(grid[i][j] == 1) continue;
                HashSet<Integer> h = new HashSet<>();
            for (int [] d: dir) {
                int p = i+d[0];
                int q = j+d[1];
             if(p>=0 && p<n && q>=0 && q<n) {
                if(grid[p][q] == 1) {
                    int v = (p*n) + q;
                if(!h.contains(ds.findPar(v))) curr+= ds.size.get(ds.findPar(v)); 
                h.add(ds.findPar(v));
                }
             }
            } 
         ans = Math.max(ans,curr);

            }
            
        }
        return ans ;
    }
}

class DS {
    ArrayList<Integer> par;
    ArrayList<Integer> size;
    public DS(int n ) {
        par = new ArrayList<Integer>();
        size = new ArrayList<Integer>();
     for(int i =0; i<n; i++) {
    par.add(i);
    size.add(1);
     }
    }
       int findPar (int u) {
        if(this.par.get(u) == u) return u;
        int par = findPar(this.par.get(u));
        this.par.set(u,par);
        return par;
    }
    
    void union (int u , int v) {
        if(this.findPar(u) == this.findPar(v)) return ;
        int uP = this.findPar(u);
        int vP = this.findPar(v);
        if(this.size.get(uP)>this.size.get(vP)) {
            this.par.set(vP,uP);
            this.size.set(uP,this.size.get(uP)+this.size.get(vP) );
        }
        else {
             this.par.set(uP,vP);
            this.size.set(vP,this.size.get(uP)+this.size.get(vP) );
        }
    }
}