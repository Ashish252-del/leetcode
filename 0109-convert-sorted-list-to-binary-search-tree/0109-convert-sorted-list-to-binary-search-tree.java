/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
      ArrayList<Integer> al = new ArrayList<Integer>();
        while(head!=null) {al.add(head.val); head = head.next;};
        return cTree(al,0,al.size()-1);
    }
    TreeNode cTree(ArrayList<Integer> al , int is , int ie) {
        if(is>ie) return null;
        int m = ((is+ie)+1)/2;
        TreeNode root = new TreeNode(al.get(m));
        root.left = cTree(al,is,m-1);
        root.right = cTree(al,m+1,ie);
        return root;
    }
}