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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Stack<Integer> s = new Stack<>();
        boolean a = true;
        while(q.size()!=0){
            int t = q.size();
            List<Integer> curr = new ArrayList<>();
            for(int i =0; i<t; i++) {
                TreeNode temp = q.poll();
                if(a) curr.add(temp.val);
                else s.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            while(!s.isEmpty()) curr.add(s.pop());
            a=!a;
            ans.add(curr);
        }
        return ans;
    }
}