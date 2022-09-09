class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited [] = new boolean [rooms.size()];
        visited [0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
           int u = q.poll();
            for(int i =0; i<rooms.get(u).size(); i++){
                int c = rooms.get(u).get(i);
                if(!visited[c]) {visited[c]=true; q.add(c);}
                
            }
        }
        boolean ans = true;
        for(int i =0; i<visited.length; i++)
        ans = ans&&visited[i];
        return ans;
    }
}