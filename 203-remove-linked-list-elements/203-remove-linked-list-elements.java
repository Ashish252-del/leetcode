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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode prev = head;
       
        ListNode curr = head; 
       return rev(prev,curr,val,head); 
    }
    ListNode rev (ListNode prev, ListNode curr, int val, ListNode head){
        if(curr==null) return head;
        
        if(head.val==val) {head = head.next; prev=head; curr=head; return rev(prev,curr,val,head);}
        
        if(curr.val==val) {prev.next=curr.next;
                          curr=curr.next; rev(prev,curr,val,head);}
      else { prev = curr;
          curr=curr.next;
          rev(prev,curr,val,head);
      }
        return head;
    }
}