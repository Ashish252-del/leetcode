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
    public int amountOfTime(TreeNode root, int start) {
         if(root.val == start && root.left == null && root.right == null) return 0;
        HashMap<TreeNode,TreeNode> m = new HashMap<>();
        m.put(root, null);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode entreeNode = null;
        while (!q.isEmpty()){
           TreeNode temp = q.poll();
            if(temp.val == start) entreeNode = temp;
            if(temp.left!=null) {
                q.add(temp.left);
                m.put(temp.left,temp);
            }
            if(temp.right!=null) {
                q.add(temp.right);
                m.put(temp.right,temp);
            }
        }
        int ans = 0;
        HashSet<TreeNode> h = new HashSet<>();
        h.add(entreeNode);
        q.add(entreeNode);
        while (!q.isEmpty()) {
         int n = q.size();
            boolean isBurn = false ;
            for(int i =0; i<n; i++) {
                TreeNode t = q.poll();
                // check for right and left 
                TreeNode l = t.left;
                TreeNode r = t.right;
                TreeNode p = m.get(t);
           if(l!=null && !h.contains(l)) {h.add(l); q.add(l); isBurn = true;}
            if(r!=null && !h.contains(r)){ h.add(r); q.add(r); isBurn = true;}
           if(p!=null && !h.contains(p)) {h.add(p); q.add(p); isBurn = true;}

            }
          //if(isBurn) 
              ans++;
        }
        return ans-1;
    }
}