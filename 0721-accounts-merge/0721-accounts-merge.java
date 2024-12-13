class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,Integer> h = new HashMap<>();
        DisjointSet ds = new DisjointSet(accounts.size());
        int i =0;
        for (List<String> l :accounts) {
            for(int j = 1; j<l.size(); j++) {
                if(h.containsKey(l.get(j))) {
                    ds.unionBySize(i,h.get(l.get(j)));
                }
                else h.put(l.get(j),i);
            }
            i++;
        }
       Map<Integer,List<String>> hm = new HashMap<>(); 
       for(Map.Entry<String,Integer> e : h.entrySet()) {
           int p = ds.findUPar(e.getValue());
           if(!hm.containsKey(p)) {
               hm.put(p, new ArrayList<String>());
               hm.get(p).add(accounts.get(p).get(0)); 
           }
            hm.get(p).add(e.getKey());
       } 
       for(Map.Entry<Integer,List<String>> e : hm.entrySet()) {
          List<String> l = e.getValue();
           Collections.sort(l.subList(1 ,l.size()));
           ans.add(l);
       }
        return ans; 
    }
}

class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}