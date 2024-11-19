class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int cnt = 0;
        int ans [] = new int [numCourses];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i =0; i<numCourses; i++) {
           if(!mp.containsKey(i)) mp.put(i,0);
        }
        for(int i =0; i<prerequisites.length; i++) {
             if(!mp.containsKey(prerequisites[i][0])) mp.put(prerequisites[i][0],1);
           else mp.put(prerequisites[i][0],mp.get(prerequisites[i][0])+1);
        }
        Queue<Integer> q = new LinkedList<>();
       for(int i =0; i<numCourses; i++) {
           if(mp.get(i) == 0) {q.add(i); mp.remove(i);}
       } 
        while(!q.isEmpty()) {
            int curr = q.poll();
            ans[cnt++] = curr;
         for(int i = 0; i<prerequisites.length; i++) {
             if(prerequisites[i][1] == curr) {
    if(mp.get(prerequisites[i][0])>0) 
        mp.put(prerequisites[i][0],mp.get(prerequisites[i][0])-1);
    if(mp.get(prerequisites[i][0])==0) 
    {q.add(prerequisites[i][0]); mp.remove(prerequisites[i][0]);}
             }
         }
        }
         if(cnt != numCourses) return (new int [0]);
        return ans;
    }
}