class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Players> pq = new PriorityQueue<> (Collections.reverseOrder());
        for(int i =0; i<score.length; i++)
            pq.add(new Players(score[i],i));
        String ans [] = new String[score.length];
        int cnt = 1;
        while(!pq.isEmpty()){
            Players p = pq.poll();
           if(cnt==1)  {ans[p.index ]= "Gold Medal"; cnt++;}
            else if (cnt==2)  {ans[p.index ]= "Silver Medal"; cnt++;}
            else if(cnt==3)  {ans[p.index ]= "Bronze Medal"; cnt++;}
          else {ans[p.index ]= ""+cnt;  cnt++;}
           
        }
        return ans;
    }
}
class Players implements Comparable<Players> {
    int score; int index;
    public Players (int score, int index) {
        this.score = score; this.index = index;
    }
    public int compareTo(Players that) 
    {return this.score-that.score;}
}