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
    public List<Integer> inorderTraversal(TreeNode root) {
       ArrayList<Integer> arr = new ArrayList<>();
        travers(arr,root);
        return arr;
    }
   public void travers( ArrayList<Integer>arr, TreeNode root){
        if(root==null) return;
       travers(arr,root.left);
        arr.add(root.val);
        travers(arr,root.right);
    }
}