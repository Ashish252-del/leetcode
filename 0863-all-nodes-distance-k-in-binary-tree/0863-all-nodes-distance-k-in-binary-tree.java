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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if( root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        HashMap<TreeNode, TreeNode> relation = new HashMap<>();
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            TreeNode left = t.left;
            TreeNode right = t.right;
            if(left!=null) {
                q.add(left);
                relation.put(left,t);
            }
            if(right!=null) {
                q.add(right);
                relation.put(right,t);
            }
        }
        HashSet<TreeNode> visited = new HashSet<>();
        visited.add(target);
         Queue<TreeNode> qw = new LinkedList<>();
        qw.add(target);
        while(!qw.isEmpty() && k>0) {
            int n = qw.size();
            for(int i =0; i<n; i++)
           { TreeNode t = qw.poll();
            TreeNode left = t.left;
            TreeNode right = t.right; 
            if(left != null && !visited.contains(left)) {qw.add(left); visited.add(left);}
             if(right != null && !visited.contains(right)) {qw.add(right); visited.add(right);}
            if(relation.containsKey(t) && !visited.contains(relation.get(t))) {
                qw.add(relation.get(t));
                visited.add(relation.get(t));
            }}
            k--;  
        }
        while(!qw.isEmpty()) {
             TreeNode t = qw.poll();
            ans.add(t.val);}
        return ans ;
    }
}