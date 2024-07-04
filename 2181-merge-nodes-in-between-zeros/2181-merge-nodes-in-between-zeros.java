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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode prev = null; 
        ListNode next = null;
        ListNode ans = null;
        int cnt = 0;
        ListNode curr = head; 
        while(curr != null) {
            cnt += curr.val;
            if(curr.val == 0 && cnt != 0) {
                if(prev == null) {
                    prev = new ListNode(cnt, next);
                    ans = prev;
                }
                else {
                    ListNode t = new ListNode(cnt, next);
                    prev.next = t;
                    prev = t; 
                }
                cnt = 0;
            }
            curr = curr.next;
        }
        return ans; 
    }
}