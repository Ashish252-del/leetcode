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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
       height(root);
        return ans-1 ;
    }
    public int height (TreeNode root) {
        if(root == null ) return 0;
        int l = height(root.left);
        int r = height(root.right);
        int curr = 1+Math.max(l,r);
        ans = Math.max(ans,(1+l+r));
        return curr;
    }
}