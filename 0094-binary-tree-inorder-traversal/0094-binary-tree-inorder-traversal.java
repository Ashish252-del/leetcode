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
        List<Integer> ls=new ArrayList<>();
        if(root==null){
            return ls;
        }
        Stack<TreeNode>s=new Stack<>();
        TreeNode temp=root;
        while(true){
            if(temp!=null){
                s.push(temp);
                temp=temp.left;
            }
            else{
                if(s.isEmpty()) break;
                temp=s.pop();
                ls.add(temp.val);
                temp=temp.right;
            }
        }
            return ls;
    }
    
}