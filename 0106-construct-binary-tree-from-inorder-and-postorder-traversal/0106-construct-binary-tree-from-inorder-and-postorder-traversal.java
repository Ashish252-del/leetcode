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
    int pre = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        pre=inorder.length-1;
        return cTree(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode  cTree(int [] in, int [] pos , int is , int ie) {
        if(is>ie || pre <0 ) return null;
        int index=0;
          TreeNode root = new TreeNode(pos[pre]);
        pre = pre-1;
        for(int i =is; i<=ie; i++) {
            if(in[i]==root.val){ index = i; break;}
        }
        root.right = cTree(in,pos,index+1,ie);
        root.left = cTree(in,pos,is,index-1);
        return root;
    }
}