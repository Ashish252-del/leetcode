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
    public void flatten(TreeNode root) {
       
        link (root);
        
    }
    private TreeNode link(TreeNode root) {
       if(root==null) return null;
        TreeNode head = root;  
        TreeNode temp = link(root.left);
       TreeNode temp2 = link(root.right);
       // head.left = null;
      //  head.right=null;
        if(temp==null && temp2==null) return head;
        if(temp!=null && temp2!=null) {
            head.left = null;
            head.right=temp;
            while (temp.right!=null) temp = temp.right;
            temp.right = temp2;
        }
        else if (temp2==null) {
            head.left = null;
            head.right = temp;
        }
    else if(temp==null) {
                     head.right = temp2;
                    head.left = null;
    }
        return head;
        
    } 
}