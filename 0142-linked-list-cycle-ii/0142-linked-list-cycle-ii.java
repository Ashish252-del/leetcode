/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a = head , b = head;
        if(a==null) return a ;
         if(a.next==null) return null; 
        while(b!=null && b.next!=null ) {
            a=a.next;
            b=b.next.next;
            if(a==b) break;
            
        }
        if(b==null || b.next == null) return null ; 
        if(a==head) return head ;
        b = head ; 
        while(a!=b) {
           // if(a==null) return null;
            a=a.next;
                     if(a==b) return a ;
           // if(b==null) return null;
                     b=b.next;}
        return a ;
    }
}