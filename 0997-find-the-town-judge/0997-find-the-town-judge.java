class Solution {
    public int findJudge(int n, int[][] trust) {
          HashSet <Integer> s = new HashSet<>();
        int check = 0, curr = 0;
       
        for(int i =0; i<trust.length; i++){
            s.add(trust[i][0]);
        }
         for(int i =1; i<=n; i++)  {
             if(!s.contains(i)) {check = i; break;}
         }
       
       if(check==0) return -1;
        int cnt = 0;
        
        for(int i =0; i<trust.length; i++){
            if(trust[i][1]==check) cnt++;
        }
        if(cnt==(n-1)) return check;
        return -1;
    }
}