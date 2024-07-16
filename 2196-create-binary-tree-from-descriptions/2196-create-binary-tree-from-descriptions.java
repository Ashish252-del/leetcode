/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,List<int[]>> m = new HashMap<>();
        int head = -1;
        Set<Integer> h = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        for(int i = 0; i<descriptions.length; i++) {
          if(!c.contains(descriptions[i][0])) h.add(descriptions[i][0]);
            h.remove(descriptions[i][1]);
            c.add(descriptions[i][1]);
            if(m.containsKey(descriptions[i][0])) {
                 List<int[]> child = m.get(descriptions[i][0]);
                 child.add(new int []{descriptions[i][1],descriptions[i][2] });
                m.put(descriptions[i][0], child);
            }
            else {
            List<int[]> child = new ArrayList<>();
           child.add(new int []{descriptions[i][1],descriptions[i][2] });  
           m.put(descriptions[i][0], child);
            }
           
        }
        for(Integer e:h) head = e;
        TreeNode ans = new TreeNode(head);
        solve(ans, m);
        return ans ;
    }
    
    public void solve (TreeNode root ,  Map<Integer,List<int[]>> m) {
        if(m.size() == 0) return ;
       if(m.containsKey(root.val)) {
            List<int[]> child = m.get(root.val);
           for(int[] c: child) {
               if(c[1] == 0) {
                   TreeNode temp = new TreeNode(c[0]);
                   root.right = temp ;
                   solve(temp, m);
               }
               else {
                    TreeNode temp = new TreeNode(c[0]);
                   root.left = temp ;
                   solve(temp, m);
               }
           }
           m.remove(root.val);
       }
    }
}