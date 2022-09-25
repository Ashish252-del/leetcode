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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode prev = head, curr = head.next;
        return rev(curr, prev, head);
    }
    ListNode rev (ListNode curr, ListNode prev, ListNode head){
        if(curr==null) return head;
       
        if(prev.val==curr.val) {
            prev.next = curr.next; curr = curr.next;
           return rev(curr,prev,head);
        }
      prev = curr; curr=curr.next;
       return rev(curr,prev,head);
    }
}