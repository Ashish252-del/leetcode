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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null ) return ans ;
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);  
        while(!q.isEmpty()) {
            int n = q.size();
            int min = Integer.MIN_VALUE;
            for(int i =0; i<n; i++) {
                TreeNode t = q.poll();
                min = Math.max(min, t.val);
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
            }
            ans.add(min);
        }
       return ans ; 
    }
}