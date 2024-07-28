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
    public boolean isValidBST(TreeNode root) {
      //  if(root.left==null&&root.right==null) return true;
     long a = Long.MAX_VALUE;
        long b = Long.MIN_VALUE;
        return check(root,a,b);
    }
    boolean check(TreeNode root, long a, long b){
      if(root==null) return true;
        return(root.val<a&&root.val>b&&check(root.left,root.val,b)&&check(root.right,a,root.val));
    }
}