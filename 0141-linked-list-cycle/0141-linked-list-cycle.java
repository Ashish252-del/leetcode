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
    public boolean hasCycle(ListNode head) {
        ListNode a = head , b = head;
        if(head == null || head.next == null) return false ;
        if(a.next==null) return false; 
        b=a.next.next;
        if(b==null) return false;
        if(a==b) return true;
        while(a!=b) {
            a=a.next;
            if(a==null) return false;
            if(b.next==null) return false;
            b=b.next.next;
            if( b==null) return false ;
            if(a==b) return true;
            
        }
        return false; 
    }
}