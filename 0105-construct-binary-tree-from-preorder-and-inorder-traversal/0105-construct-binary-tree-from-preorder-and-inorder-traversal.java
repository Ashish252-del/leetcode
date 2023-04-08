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
    int preIndex =0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     return cTree(preorder,inorder,0,preorder.length-1); 
    }
    public TreeNode cTree(int [] pre, int [] in, int is , int ie) {
        if(is>ie|| preIndex==pre.length ) return null;
        TreeNode root = new TreeNode(pre[preIndex++]);
        int index =0;
        for(int i =is; i<=ie; i++) {
            if(in[i]==root.val) {
               index = i; break;
            }
        }
             root.left = cTree(pre,in,is,index-1);
             root.right = cTree(pre,in,index+1,ie);
        return root;
    }
}