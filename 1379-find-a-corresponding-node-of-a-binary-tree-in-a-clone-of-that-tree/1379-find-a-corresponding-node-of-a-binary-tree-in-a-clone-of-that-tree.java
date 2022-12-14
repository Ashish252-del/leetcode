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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(target==null ) return target;
       Queue<TreeNode> q = new LinkedList<>();
        q.add(cloned);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.val==target.val) return curr;
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
       return null; 
    }
}