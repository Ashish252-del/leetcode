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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sl = head , fast = head ;
        for(int i =0; i<=n; i++) {
            if(fast == null) {
                sl = sl.next ;
                return sl; 
            }
            fast = fast.next;
        }
        
        while(fast!=null) {sl = sl.next; fast=fast.next;}
        sl.next = sl.next.next;
        return head;
    }
}