class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Doublet> pq = new PriorityQueue<>();
        for(int i = 0; i<mat.length; i++){
           int cnt = 0;
            for(int j =0; j<mat[i].length; j++){
                if(mat[i][j]==1) cnt++;
            }
            pq.add(new Doublet(i,cnt));
        }
       int ans [] = new int[k];
        for(int i =0; i<k; i++)
            ans[i] = (pq.poll()).index;
        return ans;
    }

}
class Doublet implements Comparable <Doublet> {
    int index, val;
    Doublet (int index, int val){
       this.index = index; this.val = val;
    }
   public int compareTo(Doublet that){
       if(this.val==that.val) return this.index-that.index;
      return this.val-that.val;
   }
}
