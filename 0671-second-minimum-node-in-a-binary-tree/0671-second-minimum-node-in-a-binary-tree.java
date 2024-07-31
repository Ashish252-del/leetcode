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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null ) return -1;
        long ans = getMin(root,Long.MAX_VALUE,Long.MAX_VALUE);
        if(ans == Long.MAX_VALUE+1) return -1;
        return (int)ans ;
        
    }
    public long getMin (TreeNode root , long ans, long min) {
        if(root == null) return ans;
        if((long)root.val > min && root.val <ans ) ans = (long)root.val;
        if((long)root.val < min) {ans = min; min = (long)root.val;}
        long l = getMin(root.left,ans,min);
        long r = getMin(root.right,ans,min);
       // if(l == Integer.MAX_VALUE && r== Integer.MAX_VALUE) return -1;
        return Math.min(l,r);
    }
}