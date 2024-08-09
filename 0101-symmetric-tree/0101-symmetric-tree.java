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
    public boolean isSymmetric(TreeNode root) {
       if(root==null) return true;
      return  isSame(root.left, root.right);
    }
    boolean isSame(TreeNode a, TreeNode b){
        if(a==null&&b==null) return true;
        else if(a!=null &&b==null) return false;
        else if(a==null&&b!=null) return false;
        else if(a.val!=b.val) return false;
        return isSame(a.left,b.right)&&isSame(a.right,b.left);
    }
}