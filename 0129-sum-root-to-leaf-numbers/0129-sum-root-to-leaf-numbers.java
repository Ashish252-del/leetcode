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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
      return count (root, 0);
    }
    public int count (TreeNode root, int curr  ) {
      if(root==null) return sum;
      if(root.left==null && root.right==null) {
          curr = curr*10 + root.val;
          sum += curr;
          return sum;
      }
        if(root.right != null && root.left != null) {
                    curr = curr*10 + root.val;
                    count(root.left, curr);
                    count(root.right, curr);
        }
       else if(root.left ==null) {
          curr = curr*10 + root.val;
           return count (root.right,curr) ;
        }
       else if(root.right == null) {
            curr = curr*10 + root.val;
           return  count (root.left,curr);
        }
     
        return sum ;
     
        
    }
}