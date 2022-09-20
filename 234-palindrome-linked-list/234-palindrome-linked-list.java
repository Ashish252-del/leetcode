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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        ListNode prev = null;
        ListNode p = new ListNode(head.val);
        ListNode curr = p;
        ListNode a = head;
        while(a.next!=null){curr.next = new ListNode(a.next.val); curr=curr.next; a=a.next;}
        ListNode b = rev(prev,p);
        a = head;
        while(a!=null&&b!=null)
        {
            if((a.val)!=(b.val)) return false;
            a =a.next;
            b=b.next;
        }
        return true;
    }
     ListNode rev(ListNode prev, ListNode curr){
        if(curr.next==null){
            curr.next=prev;
            return curr;
        }
        ListNode l = curr.next;
        curr.next = prev;
        prev = curr;
        return rev(prev,l);
    }
}