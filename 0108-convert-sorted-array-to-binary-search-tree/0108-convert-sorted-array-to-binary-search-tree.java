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
    public TreeNode sortedArrayToBST(int[] nums) {
      return cTree(nums, 0, nums.length-1);  
    }
    TreeNode cTree (int [] nums, int is , int ie) {
        if(is>ie) return null;
        int m = ((is+ie))/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = cTree(nums,is,m-1);
        root.right = cTree(nums,m+1,ie);
        return root;
    }
}