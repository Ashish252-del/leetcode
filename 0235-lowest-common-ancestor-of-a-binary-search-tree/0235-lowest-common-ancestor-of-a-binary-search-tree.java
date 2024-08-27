/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val ) return root;
        if(lowestCommonAncestor(root.left,p,q) == null) return lowestCommonAncestor(root.right,p,q);
        if(lowestCommonAncestor(root.right,p,q) == null) return lowestCommonAncestor(root.left,p,q);
        return root;

    }
}