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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i<to_delete.length; i++)
            h.add(to_delete[i]);
       solve(root, null , null , ans , h);
         return ans;   
        
        // root , para 
       // return ans ;
    }
      public void solve(TreeNode root, TreeNode dada,TreeNode papa, List<TreeNode> ans, HashSet<Integer> h) {
        if(root == null && !ans.contains(dada)) {ans.add(dada); return;}
          if(root == null) return;
       if(h.contains(root.val)) {
           if(papa == null ) {
              if(root.left != null)  solve(root.left, null , null , ans , h);
                if(root.right != null)  solve(root.right, null , null , ans , h);
               return;
           }
           if(papa.left == root) {
               papa.left = null;
            if(root.left != null)  solve(root.left, null , null , ans , h);
            if(root.right != null)  solve(root.right, null , null , ans , h);
             if(!ans.contains(dada)) {ans.add(dada); return;}
             return;
           }
            if(papa.right == root) {
               papa.right = null;
            if(root.left != null)  solve(root.left, null , null , ans , h);
            if(root.right != null)  solve(root.right, null , null , ans , h);
             if(!ans.contains(dada)) {ans.add(dada); return;}
             return;
           }
       }
          if (dada == null ) dada = root;
       solve(root.left, dada , root , ans , h);
       solve(root.right, dada , root , ans , h); 
    }
}