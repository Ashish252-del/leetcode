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
            List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
       
        List<Integer> temp = new ArrayList<>();
         allPath(ans,root,targetSum,temp);
        return ans; 
    }
    public boolean allPath ( List<List<Integer>> ans,TreeNode root, int sum,List<Integer> temp) {
        if(root==null) return false;
        if(root.left==null && root.right== null) {
            if (root.val == sum){
                temp.add(root.val);
              List<Integer> arr = new ArrayList<>();
              for(int i =0;i<temp.size(); i++) arr.add(temp.get(i));      
            ans.add(arr);
            // while(temp.size()>1) temp.remove(temp.size()-1);    
            return true;    
         }
                           // temp.add(root.val);
           return false;
        }
        
        temp.add(root.val);
       boolean a =  allPath(ans,root.left,sum-root.val,temp);
         if (a) temp.remove(temp.size()-1);
       boolean b =  allPath(ans,root.right,sum-root.val,temp);
         if (b) temp.remove(temp.size()-1);
        if(a==false && b==false) temp.remove(temp.size()-1);
       return a||b;
    }
}