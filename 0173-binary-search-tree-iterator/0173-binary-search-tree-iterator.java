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
class BSTIterator {

    Stack<TreeNode> tree=  new Stack<>();
    int l = 0;
    public BSTIterator(TreeNode root) {
        
        TreeNode curr = root;
       while(curr!=null) {tree.push(curr); curr= curr.left;}
    }
    
    public int next() {
        TreeNode curr = tree.pop();
       TreeNode cur = curr.right;
         while(cur!=null) {tree.push(cur); cur= cur.left;}
        return curr.val;
    }
    
    public boolean hasNext() {
        return tree.size()>0;
    }
    
	// adds node values to ArrayList (tree)
    // private void inorder(TreeNode root) {
    //     if (root != null) {
    //         inorder(root.left);
    //         tree.add(root.val);
    //         inorder(root.right);
    //     }
    // }
}
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */