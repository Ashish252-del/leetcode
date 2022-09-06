class Solution {
    public int findCenter(int[][] edges) {
        Map <Integer, Integer> m = new HashMap<>();
        for(int i =0; i<edges.length; i++){
            for(int j =0; j<2; j++){
                if(m.containsKey(edges[i][j]))
                    m.put(edges[i][j], m.get(edges[i][j])+1);
                else m.put(edges[i][j], 1);
            }
        }
    for(Map.Entry<Integer, Integer> ele: m.entrySet()){
        if (ele.getValue()==edges.length) return ele.getKey();
    }
        return 0;
    }
}