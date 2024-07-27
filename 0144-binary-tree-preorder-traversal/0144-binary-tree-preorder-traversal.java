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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<TreeNode> h = new Stack<>();
        if(root == null) return arr;
        h.push(root);
        while(!h.isEmpty()) {
           TreeNode curr = h.pop();
            arr.add(curr.val);
            if(curr.right!= null) {h.push(curr.right); }
             if (curr.left!=null) {h.push(curr.left); }
        }
        return arr;
    }
}